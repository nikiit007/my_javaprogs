
package december_codechef;

import java.io.*;
import java.util.*;
import myutil.Reader;


public class CHEFST
{
	private static final int MAX =100;
	public static void main(String[] args)throws IOException
	{
		int T;
		Reader.init(System.in);
		PrintWriter out =new PrintWriter(System.out);
		T=Reader.nextInt();


		while (T-->0)
		{
			long n1,n2,diff;
			int m,k;
			n1=Reader.nextLong();
			n2=Reader.nextLong();
			m=Reader.nextInt();
			k=find_k(m, Math.min(n1, n2));
			diff=m*(m+1)/2-k*(k+1)/2;
			out.println(k);
			out.println(diff);
			



		}
		out.flush();
		out.close();



	}
	private static int find_k(int m, long n)
	{
		int k1,k2,k3,k;
		long diff1,diff2,diff3,n_diff;
		k1=(int) Math.sqrt(m*(m+1)-2*n);
		k2=k1-1;
		k3=k1+1;
		diff1=m*(m+1)/2-k1*(k1+1)/2;
		diff2=m*(m+1)/2-k2*(k2+1)/2;
		diff3=m*(m+1)/2-k3*(k3+1)/2;
		System.out.println(k1+","+k2+","+k3);
		System.out.println(diff1+","+diff2+","+diff3);
		if (diff1<0)diff1=Long.MIN_VALUE;
		if (diff2<0)diff2=Long.MIN_VALUE;
		if (diff3<0)diff3=Long.MIN_VALUE;

		n_diff=Math.min(Math.min(n-diff1, n-diff2), n-diff3);
		if(n_diff==n-diff1)
			k=k1;
		else
			if(n_diff==n-diff2)
				k=k2;
			else

				k=k3;



		return k;
	}
}
