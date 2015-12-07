package november_codechef;
import java.io.*;

import myutil.Reader;


import java.util.*;

public class SMPLSUM
{

	public static void main(String[] args) throws IOException
	{
		int MAX=10000001;
		//int N=50;
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
		
		HashMap<Integer,Integer> x=new HashMap<Integer,Integer>();
		HashMap<Pair,Long> y= new HashMap<Pair,Long>();
	int T,n;
	long prod;
	Reader.init(System.in);
	T=Reader.nextInt();
	PrintWriter out = new PrintWriter(System.out);
	
	while(T-->0)
	{
		n=Reader.nextInt();
		x=generate_factors(n, sp);
		prod=1;
		
		for(Map.Entry<Integer, Integer> entry :x.entrySet())
		{
			Pair z= new Pair(entry.getKey(), entry.getValue());
			if(!y.containsKey(z))
				y.put(z, (long)(Math.pow(entry.getKey(), 2*entry.getValue()+1)+1)/(entry.getKey()+1));
			prod*=y.get(z);
		}
		
		/*for ( pr : x) 
		{
			prod*=(long)(Math.pow(pr.p, 2*pr.e+1)+1)/(pr.p+1);
			
		}*/
		out.println(prod);
	}
		
	/*	x=generate_factors(400, sp);
		for (Pair ir : x) 
		{
			System.out.println(ir.p+" "+ir.e);
			
		}*/
	
	out.flush();
	out.close();

	}
	public static HashMap<Integer,Integer> generate_factors(int N,long sp[])
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
}
class Pair
{
	int p;
	int e;
	public Pair(int p, int e) {
		super();
		this.p = p;
		this.e = e;
	}
	
	
}
