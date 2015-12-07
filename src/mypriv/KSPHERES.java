package mypriv;

import java.io.*;
import java.util.*;

public class KSPHERES {

	public static void main(String[] args) throws IOException 
	{
		Integer N,M,C,i,j,temp;
		
		Reader.init(System.in);
		N=Reader.nextInt();
		M=Reader.nextInt();
		C=Reader.nextInt();
		
		Integer U[]=new Integer[C+1];
		Integer L[]=new Integer[C+1];
		
		
		
		for(i=0;i<C+1;i++)
		{U[i]=0;L[i]=0;}
		
		
		long R[]=new long[C+1];
		long dp[][]=new long[C+1][];
		for(i=0;i<C+1;i++)
			dp[i]=new long[C+1];
		
		for(i=0;i<N;i++)
			{
			temp=Reader.nextInt();
			U[temp]++;
			}
		for(i=0;i<M;i++)
			{
			temp=Reader.nextInt();
			L[temp]++;
			}
		for(i=0;i<C+1;i++)
			R[i]=(U[i]%1000000007)*(L[i]%1000000007);
		/*for(i=small_index;i<big_index;i++)
			R[i]=0;*/
		
		for(i=0;i<C+1;i++)
			dp[i][0]=1;
		for(i=1;i<C+1;i++)
			dp[0][i]=0;
		for(i=1;i<C+1;i++)
			for(j=1;j<C+1;j++)
			{
				dp[i][j]=dp[i-1][j]%1000000007+ (R[i]%1000000007)*(dp[i-1][j-1]%1000000007);
			}
		
		for(i=2;i<C+1;i++)
			System.out.print(dp[C][i]+" ");
		
		System.out.print(0);
		
		
		
		
	}

}
