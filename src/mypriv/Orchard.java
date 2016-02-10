package mypriv;

import java.io.*;
import java.util.*;

public class Orchard {

	public static void main(String[] args)throws IOException
	{
		String s,time_stamp,batch_stamp,temp="";
		PrintWriter out1=new PrintWriter("remove_from_dqworking.sh","UTF-8");
		PrintWriter out2=new PrintWriter("copy_dat_meta_ctl.sh","UTF-8");
		PrintWriter out3=new PrintWriter("move_pkg_to_inbox.sh","UTF-8");
		PrintWriter out4=new PrintWriter("get_wf_instance_id.sh","UTF-8");
		
		Reader.init(System.in);
		s="";
		HashSet<String> files_in_hive = new HashSet<String>();
		HashSet<String> files_in_archive = new HashSet<String>();
		
		HashSet<String> files_in_archive_not_in_hive = new HashSet<String>();
		HashSet<String> all_instances = new HashSet<String>();
		HashMap<String,String> mp= new HashMap<String,String>();


		s=Reader.next();
		while(!s.equals("end_of_hive"))
		{
			
			files_in_hive.add(s.substring(8,s.length()));
			s=Reader.next();
		}

		s=Reader.next();
		time_stamp=s.substring(0,8);
		
		while(!s.equals("end_of_archive"))
		{
			files_in_archive.add(s.substring(27,s.length()-9));
		
			mp.put(s.substring(27,s.length()-9), s.substring(0,s.length()-3));
			s=Reader.next();
		}
		s=Reader.next();
		s=Reader.next();
		
		while(!s.equals("end_of_instances"))
		{
			all_instances.add(s);
			s=Reader.next();
			
		}
		
		for (String st : files_in_archive_not_in_hive)
		{
			temp=temp+mp.get(st)+"dat"+"|";
			
		}
		
		
		for (String st : files_in_archive) 
		{
			if(!files_in_hive.contains(st))
				files_in_archive_not_in_hive.add(st);
		}
		
		out1.println("#!/bin/bash");
		
		out2.println("#!/bin/bash");
		out2.println("cd /datafabric/p_inbound/optum/optumrx/orx001/inbox/archive");
		
		out3.println("#!/bin/bash");
		out3.println("cd /datafabric/p_inbound/optum/optumrx/orx001/inbox/archive");
		
		out4.println("#!/bin/bash");
		
		
		
		for (String st : all_instances) 
		{
			
			out4.println("cd /opt/prd/log/WORKFLOW/CommonIntakeWorkflow/"+st);
			out4.println("egrep -Hwl '"+temp.substring(0, temp.length()-2)+"' CommonIntakeWorkflow_"+st+".log");
		}
		
		for (String st : files_in_archive_not_in_hive)
		{
			out1.println("hadoop fs -rmr /datalake/optum/optuminsight/p_datafabric/datafabric/p_hdfs/optum/optumrx/orx001/dq_working/"+mp.get(st)+"*");
			out1.println("sleep 5");
			out2.println("cp "+mp.get(st)+"dat "+mp.get(st)+"meta "+mp.get(st)+"ctl ../");
			out2.println("sleep 5");
			out3.println("mv "+mp.get(st)+"pkg ../");
		}
		out1.println("exit");
		out2.println("exit");
		out3.println("exit");
		out4.println("end_of_instances");
		out4.println("exit");
		
		out1.flush();
		out1.close();
		out2.flush();
		out2.close();
		out3.flush();
		out3.close();
		out4.flush();
		out4.close();
	}
	

}
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

   
    public static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

   
    public static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
           
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    public static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
    
    public static long nextLong() throws IOException {
		return Long.parseLong( next() );
	}
	
    public static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}

