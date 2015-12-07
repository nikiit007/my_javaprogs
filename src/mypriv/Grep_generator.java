
package mypriv;
import java.io.*;

import java.util.ArrayList;



public class Grep_generator {

	public static void main(String[] args) throws IOException
	{

		ArrayList<String> a = new ArrayList<String>();
		
		Reader.init(System.in);
		String x= new String();
	
		
		Reader.init(System.in);
		x=Reader.next();
		 while(!x.equals("]"))
		 {
			 x=x.substring(0, 19);
				 a.add(x);
			 x=Reader.next();
			 
		 }
		 for (String p : a)
		 {
		   System.out.println(p+", grep "+p+" *.ctl");
		}
		 /*while(i++<a.size())
		 {
			 System.out.println(a.get(i)+" grep "+a.get(i)+" *.ctl");

			 
		 }*/
		/*if(x.equals("]"))
				System.out.println("true");
		else 
			System.out.println("false");
		*/
		 


		
		
		
	}
}