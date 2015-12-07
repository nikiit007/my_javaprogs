package mypriv;

import java.io.*;
import java.util.*;


public class Donuts {


	public static void main(String[] args)throws IOException
	{
		Reader.init(System.in);

		Integer T,N,M,i;

		T= Reader.nextInt();

		while(T-->0)
		{
			//ArrayList<Integer> a;
			Integer cut=0,firstid,lastid,big;
			

			N = Reader.nextInt();
			M = Reader.nextInt();
			Integer a[]=new Integer[M];
			for(i=0;i<M;i++)
			{
				a[i]=Reader.nextInt();
			}
			Arrays.sort(a);
			firstid=0;
			lastid=M-1;
			while(firstid<lastid)
			{
				
				a[firstid]=a[firstid]-1;
				
				cut++;
				
				if(a[firstid]==0)
					firstid++;
			
				big=a[lastid];
				lastid--;
				
				a[lastid]=a[lastid]+big;
			}
			System.out.println(cut);
			
			
		}


	}

}
