package mypriv;

import java.io.*;
//import java.util.*;

public class WDTBAM {



	public static void main(String[] args)throws IOException
	{
		int T;
		int N,i,count;
		long W[],W1[],temp,big;
		String X,Y;
		Reader.init(System.in);
		T = Reader.nextInt();
		while(T-->0)
		{
			count=0;
			N=Reader.nextInt();
			W = new long[N+1];
			W1 = new long[N+1];
			X=Reader.next();
			Y=Reader.next();
			W[0]=Reader.nextLong();
			big =W[0];
			for(i=1;i<N+1;i++)
			{
				temp=Reader.nextLong();
				W1[i]=temp;
				if(temp>big)
					big=temp;
				W[i]=big;
				
			}
			for(i=0;i<X.length();i++)
			{
				if(X.charAt(i)==Y.charAt(i))
					count++;
					
			}
			if(count==X.length())
			System.out.println(W1[count]);
			else
				System.out.println(W[count]);


		}






	}



}
