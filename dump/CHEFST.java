
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
		long sum[]=new long[MAX];
		int ind[]=new int[MAX];
		for(int i=0;i<MAX;i++)
			ind[i]=i;
		sum[0]=0;
		for(int i=1;i<MAX;i++)
			sum[i]=i*(i+1)/2;
		for(int i=0;i<MAX;i++)
			out.print(sum[i]+" ");
		
		/*while (T-->0)
		{
			long n1,n2;
			int m,index=0;
			n1=Reader.nextLong();
			n2=Reader.nextLong();
			m=Reader.nextInt();
			//out.println(Arrays.binarySearch(sum, 92));
			if (sum[m]>Math.min(n1, n2))
				index=Math.abs(Arrays.binarySearch(sum, sum[m]-Math.min(n1, n2)));
			out.println(index);
			out.println(ind[index]);
			out.println(Math.min(n1, n2)-sum[index-2]);


		}*/
		out.flush();
		out.close();



	}

}
