package codechef.june_2016;
import java.io.*;
import java.util.*;



public class CHEFARK 
{

	public static void main(String[] args) throws IOException
	{
		long T,N,K,N_temp,a;
		Reader.init(System.in);
		T=Reader.nextLong();
		while(T-->0)
		{
			N=Reader.nextLong();
			K=Reader.nextLong();
			
			/*N_temp=N;
			while(N_temp-->0)
				a=Reader.nextLong();*/
			
			System.out.println(sumbincoef(N-1,K));
			
				
		}
	}
	
	private static long sumbincoef( long N, long k )
	{
		  long i, bincoef = 1l, sum = 1l;
		  if(k>N)
			  k=N;
		  for( i=1l ; i<=k ; ++i ) 
		  {
		    bincoef = (bincoef*(N-i+1))/i;
		    if (bincoef>1000000007l)
		    	bincoef-=1000000007l;
		    sum += bincoef;
		    if (sum>1000000007l)
		    	sum-=1000000007l;
		  }
		  return sum;
		}

}
