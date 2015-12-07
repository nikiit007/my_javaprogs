package mypriv;

import java.io.*;
//import java.util.*;

public class SUBINC {

	public static void main(String[] args) throws IOException
	{
		Integer T,N;
		int i;
		Reader.init(System.in);
		T= Reader.nextInt();
		
		while(T-- >0)
		{
			N=Reader.nextInt();
			Long A[]= new Long[N];
			long total=0,count=1;
			for(i=0;i<N;i++)
			{
				A[i]=Reader.nextLong();
			}
			for(i=1;i<N;i++)
			{
				if(A[i]<A[i-1])
				{
					total +=(count*(count+1))/2;
					count=1;
				}
				else
					count++;
				
				//System.out.println(A[i]+" "+count+" "+total);
			}
			total +=(count*(count+1))/2;
			System.out.println(total);
		}
		
		
	}

}
