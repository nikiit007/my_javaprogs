package november_codechef;

import java.util.*;
import java.io.*;


import myutil.Reader;

public class SMPLSUM2 {

	public static void main(String[] args) throws IOException
	{
		int N= 10000010;

		int i,k;
		int phi[]=new int[N + 1];



		phi = calc_sieve(N);
		long []n_phi = new long[N+1];
		long []ans= new long[N+1];
		for(i=1;i<N+1;i++)
			ans[i]=0;
		for(i=1;i<N+1;i++)
		{
			n_phi[i]=(long)i*(long)phi[i];
		}
		for(i=1;i<N+1;i++)
		{
			k=1;
			while((i*k)<(N+1))
			{
				ans[i*k]+=n_phi[i];
				k++;

			}

		}




		int T,n;
		
		
            
            

		Reader.init(System.in);
		
		//T=Reader.nextInt();
		
	
		PrintWriter out = new PrintWriter(System.out);
		
		for(i=1;i<N+1;i++)
			out.println(ans[i]);
      

		/*while(T-->0)
		{
			n=Reader.nextInt();
			
			
			
			
		

			out.println(ans[n]);
		}*/
		
		out.flush();
		out.close();
		
	}





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
	public static int[] calc_sieve(int N)
	{
		int lp[]=new int[N + 1];
		int phi[]=new int[N + 1];
		ArrayList<Integer> pr =new ArrayList<Integer>();
		phi[1] = 1;
		for (int i = 2; i <= N; ++i)
		{
			if (lp[i] == 0)
			{
				lp[i] = i;
				phi[i] = i - 1;
				pr.add(i);
			}
			else
			{
				//Calculating phi
				if (lp[i] == lp[i / lp[i]])
					phi[i] = phi[i / lp[i]] * lp[i];
				else
					phi[i] = phi[i / lp[i]] * (lp[i] - 1);
			}
			for (int j = 0; j < (int)pr.size() && pr.get(j) <= lp[i] && i * pr.get(j) <= N; ++j)
				lp[i * pr.get(j)] = pr.get(j);
		}
		return phi;
	}
}
