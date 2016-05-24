package geeks_for_geeks.dynamic_programming;
//corrections to be made

import java.io.IOException;


public class Longest_Palindrome_Sequence 
{

	public static void main(String[] args)throws IOException
	{
		String str="GEEKSFORGEEKS";
		int n=str.length();
		System.out.println(LPS(str.toCharArray(),0,n-1));

	}

	private static int LPS(char[] str, int i, int j) 
	{
		int [][]dp =new int[j+2][j+2];
		
		for(int k=0;k<j+2;k++) //if(i==j) return 1;
			dp[k][k]=1;
		
		for(int k=0;k<j+1;k++)
			for(int l=1;l<j+1;l++)
			{
				if(str[k]==str[l])
					if(k+1==l)
						dp[k][l]=2;
					else 
						dp[k][l]=2+dp[k+1][l-1];
				else 
					dp[k][l]=Math.max(dp[k][l-1], dp[k+1][l]);
				
			}
		
	return dp[i][j];
		
		
		
	}

}
