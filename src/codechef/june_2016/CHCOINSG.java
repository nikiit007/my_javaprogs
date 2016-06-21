package codechef.june_2016;

import java.io.*;



public class CHCOINSG 
{
	public static void main(String[] args) throws IOException 
	{
		int T,N;
		Reader.init(System.in);
		T=Reader.nextInt();
		while(T-->0)
		{
			N=Reader.nextInt();
			if(N%6!=0)
				System.out.println("Chef");
			else
				System.out.println("Misha");
		}
		
	}

}
