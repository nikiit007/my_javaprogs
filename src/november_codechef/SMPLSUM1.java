package november_codechef;
import myutil.*;
import myutil.Reader;

import java.io.*;
import java.util.*;


public class SMPLSUM1 {

	public static void main(String[] args) throws IOException
	{
		int N=10000001;
		
		long[] sp= new long[N];
		boolean[] pr=new boolean[N];

		sp=Prime.shortest_prime(N);

		pr=Prime.sieve_primes(N);


		

		int T,n;
		long prod;
		Reader.init(System.in);

		T=Reader.nextInt();
		PrintWriter out = new PrintWriter(System.out);
		HashMap<Integer, Integer> x= new HashMap<Integer,Integer>();
		n=1;
		while(T-->0)
		{
			//n=Reader.nextInt();
			
			prod=1;
			if(n==1)
			{
				out.println(1);
			}
			else if(pr[n])
			{
				out.println((long)(n-1)*(long)n+1);
			}
			else
			{
				x = Prime.generate_primefactors_and_powers(n, sp);


				for(Map.Entry<Integer, Integer> entry :x.entrySet())
				{

					prod*=(long)(Math.pow(entry.getKey(), 2*entry.getValue()+1)+1)/(long)(entry.getKey()+1);
				}

				
				out.println(prod);
				
			}
			n++;
		}



		out.flush();
		out.close();

	}





}

