package mypriv;

import java.io.*;
import java.util.*;
import java.math.*;


public class TIMEASR {

	public static void main(String[] args)throws IOException 
	{
		int T,hh,mm,i;
		double A;
		double time_min,error;
		String time;
		Reader.init(System.in);
		T=Reader.nextInt();
		
		while(T-->0)
		{
			A=Reader.nextDouble();
			Set<String> set1= new TreeSet<String>();		
			for(i=0;i<12;i++)
			{
				time_min = Math.abs(360*i-A)/(5.5);
				
				hh=(int)time_min/60;
				mm=(int)time_min%60;
			
				
				error=Math.min(Math.abs(Math.abs(0.5*(hh*60+mm)-mm*6)-A),Math.abs(Math.abs(0.5*(hh*60+mm)-mm*6)-360+A));
				
				if((error<0.0083)&&(hh<12))
				{time = convert_to_string(hh,mm);
				 set1.add(time);
				}
				
			
				
				time_min = (360*i+A)/(5.5);
				
				hh=(int)time_min/60;
				mm=(int)time_min%60;
				
				
				error=Math.min(Math.abs(Math.abs(0.5*(hh*60+mm)-mm*6)-A),Math.abs(Math.abs(0.5*(hh*60+mm)-mm*6)-360+A));
				if((error<0.0083)&&(hh<12))
				{time = convert_to_string(hh,mm);
				 set1.add(time);
				}
				
				
			}
			
			for (String str : set1)
			{
				System.out.println(str);
				
			}
			
			
			
			
			
			
		}
	

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
