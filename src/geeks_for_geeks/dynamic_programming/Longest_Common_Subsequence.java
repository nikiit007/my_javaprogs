package geeks_for_geeks.dynamic_programming;

import java.io.IOException;

public class Longest_Common_Subsequence {

	public static void main(String[] args) throws IOException
	{
		String X,Y;
		int L[][]= new int[10][10];
		//intialize(L)?;
		X="AGGTAB";
		Y="GXTXAYB";

		for(int i=0;i<=X.length();i++)
		{
			for(int j=0;j<=Y.length();j++)
			{
				if(i==0 || j==0)
					L[i][j]=0;
				else if (X.charAt(i-1)==Y.charAt(j-1))
					L[i][j]=1+L[i-1][j-1];
				else
					L[i][j]=Math.max(L[i][j-1], L[i-1][j]);


			}
		}
		System.out.println(L[X.length()][Y.length()]);


	}


}
