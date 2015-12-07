package november_codechef;


import java.io.*;

import myutil.Reader;

public class KFUNC1 {

	public static void main(String[] args) throws IOException 
	{
		long A,D,T;
		long R,L;
		PrintWriter out =new PrintWriter(System.out);
		Reader.init(System.in);
		T =Reader.nextLong();
		while (T-->0)
		{
			A=Reader.nextLong();
			D=Reader.nextLong();
			L=Reader.nextLong();
			R=Reader.nextLong();
			int []sum= new int[9];
			int []dig= new int[9];
			for(int i=0;i<9;i++)
			{
				dig[i]=digit_sum(A+i*D);
			}
			sum[0]=dig[0];

			for(int i=1;i<9;i++)
			{
				sum[i]=dig[i]+sum[i-1];
			}
			/*printarr(dig);
			printarr(sum);*/
			out.println(sum_till(sum,R)-sum_till(sum,L-1));
		}

		out.flush();
		out.close();

	}
/*	private static void printarr(int[] arr) 
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}*/
	private static int digit_sum(long l)
	{
		int sum=0;
		while(l!=0)
		{
			sum+=l%10;
			l=l/10;
		}
		if(sum<10)
			return sum;
		else
			return(digit_sum(sum));


	}

	private static long sum_till(int[] sum,long x)
	{
		if(x%9 >0)
			return( (x/9)*sum[8] + sum[(int)(x%9)-1]);
		else
			return( (x/9)*sum[8]);

	}


}
