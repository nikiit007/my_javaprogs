package mypriv;

import java.io.*;
import java.util.*;

public class ADTRI2 {

	public static void main(String[] args) throws IOException 
	{ 
		int N = 5000000;
		boolean c[]=new boolean[N+1];
		
		for(int i=0;i<=N;i++)
			c[i]=false;
		
		int T,N1;
		Reader.init(System.in);
		//ArrayList<Integer> al =new ArrayList<Integer>();

		Set<Integer> primes_4nplus1 =new HashSet<Integer>();
		//Set<Integer> primes =new TreeSet<Integer>();

		// initially assume all integers are prime
		boolean[] isPrime = new boolean[N + 1];
		for (int i = 2; i <= N; i++) {
			isPrime[i] = true;
		}

		// mark non-primes <= N using Sieve of Eratosthenes
		for (int i = 2; i*i <= N; i++) {

			// if i is prime, then mark multiples of i as nonprime
			// suffices to consider mutiples i, i+1, ..., N/i
			if (isPrime[i]) {
				for (int j = i; i*j <= N; j++) {
					isPrime[i*j] = false;
				}
			}
		}

		// count primes
		//int primes = 0;
		for (int i = 2; i <= N; i++) 
		{

			if (isPrime[i]&&(i%4==1))
				primes_4nplus1.add(i);
		}
		
		//System.out.println(primes_4nplus1.size());
		//int count=0;
		for (Integer b : primes_4nplus1) 
		{
			for(int i=b;i<=N;i+=b)
				c[i]=true;
		}
		//System.out.println(count);
		T=Reader.nextInt();
		while(T-->0)
		{
			N=Reader.nextInt();
			if(c[N])
				System.out.println("YES");
			else
				System.out.println("NO");
				
		}
	}
}
