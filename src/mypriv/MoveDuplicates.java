package mypriv;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class MoveDuplicates {

	public static void main(String[] args) throws IOException 
	{
		PrintWriter out = new PrintWriter(System.out);
		Date myDate = new Date();
		
		String ymd =new SimpleDateFormat("yyyyMMdd").format(myDate);
		
		String str="x";
		Reader.init(System.in);
		while(!str.equals("end"))
		{
			str=Reader.next();
			str.replace('.', '_');
			if (!str.equals("end"))
				out.println("mv"+" "+ymd+"*"+str.replace('.', '_')+"*"+".pkg archive");
			
			
			
		}
		
			
		out.flush();
		out.close();
				
		

	}

}
