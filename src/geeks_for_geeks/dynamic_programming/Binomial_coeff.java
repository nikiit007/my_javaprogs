package geeks_for_geeks.dynamic_programming;

import java.io.IOException;

public class Binomial_coeff 
{

	public static void main(String[] args)throws IOException
	{
		int n=5;int k=2;
		System.out.println(calc_coeff(5, 2));

	}
	public static int calc_coeff(int n, int k)
	{
		int coeff[][]= new int [n+1][k+1];
		int i,j;

		

		for(i=1;i<n+1;i++)
			for(j=0;j<k+1;j++)
			{
				if (j == 0 || j == i)
	                coeff[i][j] = 1;
	 
				else
				{
					coeff[i][j]=coeff[i-1][j-1]+coeff[i-1][j];
				}

			}
		return coeff[n][k];

	}

}
