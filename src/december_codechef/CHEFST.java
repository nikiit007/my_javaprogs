
package december_codechef;

import java.io.*;
import java.util.*;
import myutil.Reader;


public class CHEFST
{
	private static final int MAX =1000000001;
	public static void main(String[] args)throws IOException
	{
		int T;
		Reader.init(System.in);
		PrintWriter out =new PrintWriter(System.out);
		T=Reader.nextInt();
		long sum[]=new long[MAX];
		int ind[]=new int[MAX];
		for(int i=0;i<MAX;i++)
			ind[i]=i;
		sum[0]=0;
		for(int i=1;i<MAX;i++)
			sum[i]=sum[i-1]+ind[i];
		while (T-->0)
		{
			long n1,n2;
			int m,index;
			n1=Reader.nextLong();
			n2=Reader.nextLong();
			m=Reader.nextInt();
			if (sum[m]>Math.min(n1, n2))
				index=Arrays.binarySearch(sum, m-Math.min(n1, n2));


		}




	}

}
