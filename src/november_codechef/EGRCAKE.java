package november_codechef;

import myutil.Reader;

import java.io.*;


public class EGRCAKE {

	public static void main(String[] args)throws IOException
	{
		int T;
		int N,M,count;
		Reader.init(System.in);
		T =Reader.nextInt();
		PrintWriter out = new PrintWriter(System.out);
		while(T-->0)
		{
			N=Reader.nextInt();
			M=Reader.nextInt();
			count = N/gcd(N,M);
			
			

			

			
			
			if(count==N)
				out.println("Yes");
			else
				out.println("No"+" "+count);





		}
		
		out.flush();
		out.close();


	}

	private static int gcd(int n, int m) 
	{
		if (m==0)
			return n;
		else 
			return(gcd(m,n%m));
	}

}
