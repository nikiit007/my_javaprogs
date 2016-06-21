package codechef.june_2016;
import java.io.*;

public class CHEARMY 
{

	public static void main(String[] args)throws IOException
	{
		int T;
		long K;
		Reader.init(System.in);
		T=Reader.nextInt();
		while(T-->0)
		{
			K=Reader.nextLong();
			System.out.println(val(K));
			
		}

		

	}
	private static long val(long K)
	{
		if (K==1)
			return 0;
		else
		{
			long i=(K+4)%5;
			long K_new=(K+4-i)/5;
			return(10*val(K_new)+2*i);

		}
	}
}
