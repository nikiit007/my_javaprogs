package geeks_for_geeks.dynamic_programming;

public class Egg_drop
{

	public static void main(String[] args)
	{
		int n=2,k=36;
		System.out.println(egg_drp_calc(n, k));
		


	}
	private static int egg_drp_calc(int n, int k)
	{
		int dp[][]=new int[n+1][k+1];
		int i,j,res;
		
		for(i=1;i<n+1;i++)
		{
			dp[i][0]=0;
			dp[i][1]=1;
		}
		
		for(j=1;j<k+1;j++)
			dp[1][j]=j;

		for(i=2;i<n+1;i++)
			for(j=2;j<k+1;j++)
			{
				dp[i][j]=Integer.MAX_VALUE;
				for(int x=1;x<=j;x++)
				{
					res=1+Math.max(dp[i-1][x-1], dp[i][j-x]);
					if (res<dp[i][j])
						dp[i][j]=res;
				}

			}

		return dp[n][k];
	}

}
