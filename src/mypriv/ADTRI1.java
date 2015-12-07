package mypriv;
import java.io.*;
import java.util.*;




public class ADTRI1 
{
	public static void main(String[] args) throws IOException 
	{ 
		int N = 5000000;
		int T,N1;
		Reader.init(System.in);
		//ArrayList<Integer> al =new ArrayList<Integer>();

		Set<Integer> primes_4nplus1 =new TreeSet<Integer>();
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
		//System.out.println("The number of 4n+1 primes <= " + N + " is " + al.size());

		T=Reader.nextInt();
		while(T-->0)
		{
			N1=Reader.nextInt();
			int flag=0;
			for (Integer b : primes_4nplus1) 
				{
					if(N1%b==0)
					{
						//System.out.println("YES");
						flag=1;
						break;
					}
					if(b>N1)
						break;
				}
			
			if (flag==0)
				System.out.println("NO");
			else
				System.out.println("YES");

		}

	}
}
