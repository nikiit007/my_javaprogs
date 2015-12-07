package mypriv;

import java.io.*;
import java.util.*;

public class Prime_factors 
{
	public static void main(String args[])throws IOException
	{
		
		int MAX=5000001;
		int N=5000000;
		boolean v[]=new boolean[MAX];
		long sp[]= new long[MAX];
		long i;
		for (i=2L;i < MAX;i += 2L)	 //even numbers have smallest prime factor 2
			sp[(int) i] = 2L;
		for (i = 3L; i < MAX; i += 2L)
		{
			if (!v[(int) i])
			{
				sp[(int) i] = i;
				for (long j = i; (j*i) < MAX; j += 2L)
				{
					//System.out.println(j*i);
					if (!v[(int) (j*i)])	
						{
						v[(int) (j*i)] = true;
						sp[(int) (j*i)] = i;
						}

					
				}

			}

		}
		int T,N1;
		Reader.init(System.in);
		//ArrayList<Integer> al =new ArrayList<Integer>();

		Set<Integer> primes_4nplus1 =new TreeSet<Integer>();
		//Set<Integer> primes =new TreeSet<Integer>();

		// initially assume all integers are prime
		boolean[] isPrime = new boolean[N + 1];
		for ( i = 2; i <= N; i++) {
			isPrime[(int) i] = true;
		}

		// mark non-primes <= N using Sieve of Eratosthenes
		for (i = 2; i*i <= N; i++) {

			// if i is prime, then mark multiples of i as nonprime
			// suffices to consider mutiples i, i+1, ..., N/i
			if (isPrime[(int) i]) {
				for (int j = (int) i; i*j <= N; j++) {
					isPrime[(int) (i*j)] = false;
				}
			}
		}

		// count primes
		//int primes = 0;
		for (i = 2; i <= N; i++) 
		{
			
			if (isPrime[(int) i]&&(i%4==1))
				primes_4nplus1.add((int) i);
		}
		//System.out.println("The number of 4n+1 primes <= " + N + " is " + al.size());
		
		
		HashSet<Integer> vals=new HashSet<Integer>();
		for(i=3;i<=5000000;i++)
		{
			Set<Integer> factors=new HashSet<Integer>();
			factors= generate_factors((int) i, sp);
			for (Integer in : factors)
			{
				if(primes_4nplus1.contains(in))
				{
					vals.add(in);
				}
				
			}
			
			
		}

		T=Reader.nextInt();
		
		while(T-->0)
		{
			N1=Reader.nextInt();
			
			if(vals.contains(N1))
				System.out.println("YES");
			else
				System.out.println("NO");
			/*int flag=0;
			
			Set<Integer> factors=new HashSet<Integer>();
			factors= generate_factors(N1, sp);
			
			for (Integer in : factors) 
			{
				if(primes_4nplus1.contains(in))
				{
					flag=1;
					break;
				}
				
			}*/
			
			
			
			/*for (Integer b : primes_4nplus1) 
				{
					if(N1%b==0)
					{
						//System.out.println("YES");
						flag=1;
						break;
					}
					if(b>N1)
						break;
				}*/
			
			/*if (flag==0)
				System.out.println("NO");
			else
				System.out.println("YES");*/

		}


			
		
		
			
	}
	
	
	public static HashSet<Integer> generate_factors(int N,long sp[])
	{
		HashSet<Integer> ans=new HashSet<Integer>();
		while(N>1)
		{
			ans.add((int) sp[N]);
			N=(int) (N/sp[N]);
			
			
		}
		
		return ans;
		
	}
}

