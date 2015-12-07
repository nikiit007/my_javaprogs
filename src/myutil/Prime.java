package myutil;

import java.util.*;


public class Prime 
{
	
	
	 public static long[] shortest_prime(int MAX)
	{
		boolean v[]=new boolean[MAX];
		long sp[]= new long[MAX];
		long i;
		//it gives the shortest prime number for the integer which further helps in calculating the prime number.
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
		return sp;
		

	}
	 public static HashMap<Integer,Integer> generate_primefactors_and_powers(int N,long sp[])
	{
		HashMap<Integer,Integer> ans=new HashMap<Integer,Integer>();
		
		long temp;
		int e;
		while(N>1)
		{
			
			temp=N;
			e=0;
			
			while(temp%sp[N]==0)
			{
				e++;
				temp=temp/sp[N];
			}
			
			//Pair prime = new Pair((int)sp[N], e);
			//ans.add(prime);
			ans.put((int) sp[N], e);
			N=(int) (N/(Math.pow(sp[N], e)));
			
			
		}
		
		return ans;
		
	}	
     public static boolean[] sieve_primes(int N)
    {
    	int i;
    	boolean[] isPrime = new boolean[N];
		for ( i = 2; i < N; i++) 
		{
			isPrime[(int) i] = true;
		}

		// mark non-primes <= N using Sieve of Eratosthenes
		for (i = 2; i*i < N; i++) 
		{

			// if i is prime, then mark multiples of i as nonprime
			// suffices to consider mutiples i, i+1, ..., N/i
			if (isPrime[(int) i]) 
			{
				for (int j = (int) i; i*j < N; j++) 
				{
					isPrime[(int) (i*j)] = false;
				}
			}
			
		}
		return isPrime;
    }
}
