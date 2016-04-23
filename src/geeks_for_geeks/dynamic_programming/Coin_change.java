package geeks_for_geeks.dynamic_programming;

import java.io.*;


public class Coin_change {

	public static void main(String[] args) throws IOException
	{
		int P=8;
		int i,j;
		int []S= {3,4,5};
		int n=S.length;
		int [][]C = new int[n][P+1];
		for(i=0;i<n;i++)
			C[i][0]=0;
		for(i=0;i<n;i++)
			for(j=1;j<=P;j++)
			{
				if(i==0)
					if (j-S[i]>=0)
						C[i][j]=C[i][j-S[i]]+1;
					else C[i][j]=0;
				else if (S[i]>j)
					C[i][j]=C[i-1][j];
				else
					C[i][j]=Math.min(C[i-1][j], C[i][j-S[i]]+1);
			}

		System.out.println(C[n-1][P]);
		
		System.out.println("the generated array is :\n");
		for(i=0;i<n;i++)
		{
			for(j=0;j<=P;j++)
				System.out.print(C[i][j]+" ");
			System.out.println();
		}
	}




}
