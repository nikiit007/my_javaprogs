package mypriv;
import java.io.*;
import java.util.*;



public class Watermark_catcher {

	public static void main(String[] args) throws IOException {
		Map<String,String> m= new HashMap<String,String>();
		Reader.init(System.in);
		
		String key= new String();
		String value= new String();
		String t= new String();
		t=Reader.next();
		while(!t.equals("end"))
		{
			/*System.out.println(t);
			System.out.println();*/
			if(t.startsWith("0000000000000"))
				value=t;
			if(t.contains("CDB_TextFile_CDB_ML_CNSM_XREF_INCR"))
				{
				  key=t.substring(0, 56);
				  m.put(key, value);
				}
			 
			t=Reader.next();
			
		}
		
		for (String k : m.keySet()) 
		{
			System.out.println(k+ " "+m.get(k));
			
		}

	}

}
