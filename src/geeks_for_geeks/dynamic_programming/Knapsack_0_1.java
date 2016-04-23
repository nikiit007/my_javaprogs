package geeks_for_geeks.dynamic_programming;

import java.io.IOException;

public class Knapsack_0_1
{

	public static void main(String[] args)throws IOException
	{
		int val[] = {60, 100, 120};
		int wt[] = {10, 20, 30};
		int W=50;
		System.out.println(max_val(val,wt,W));



	}
	private static int max_val(int []val, int []wt,int W)
	{
		int i,j;
		int len=val.length+1;
		
		int S[][]=new int[len][W+1];

		for(i=0;i<len;i++)
		{
			for(j=0;j<W+1;j++)
			{
				if(i==0 || j==0)
					S[i][j]=0;
				else if(wt[i-1] <= j)
					S[i][j]=Math.max(val[i-1]+S[i-1][j-wt[i-1]], S[i-1][j]);
				else 
					S[i][j]=S[i-1][j];
				
			}
			
		}


		return S[len-1][W];

	}
}
