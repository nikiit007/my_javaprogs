package mypriv;


import java.io.*;

public class TIMEASR1 {

	public static void main(String[] args) throws IOException
	{
		int T;
		double A;
		Reader.init(System.in);
		T = Reader.nextInt();
		PrintWriter out = new PrintWriter(System.out);
		
		
		while(T-->0)
		{
			A=Reader.nextDouble();
			for(int h=0;h<12;h++)
				for(int m=0;m<60;m++)
				{
					double ang =Math.abs(0.5*(60*h-11*m));
					if(ang>180)
						ang=360-ang;
					double error=Math.abs(ang-A);
					if(error<.00833333333)
						out.println(convert_to_string(h, m));
				}
				
			
			
		}
		out.flush();
		out.close();
		

	}
	private static String convert_to_string(int hh, int mm) 
	{
		String t1,t2;
		if(hh<10)
			t1="0"+hh;
		else
			t1=""+hh;
		if(mm<10)
			t2="0"+mm;
		else
			t2=""+mm;
		return (t1+":"+t2);
	
	}


}
