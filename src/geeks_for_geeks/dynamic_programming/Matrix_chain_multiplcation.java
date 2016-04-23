package geeks_for_geeks.dynamic_programming;
import java.io.*;


public class Matrix_chain_multiplcation 
{

	public static void main(String[] args)throws IOException
	{
		int []p={10, 20, 30};
		System.out.println(matrix_result(p));



	}

	/*Our problem the only tricky part is arranging the order in which to compute the values (so that it is readily
	available when we need it). In the process of computing m[i, j] we will need to access values m[i, k] and m[k + 1, j] 
	for each value of k lying between i and j. This suggests that we should organize our computation according to 
	the number of matrices in the subchain. So, lets work on the subchain:
	Let L = j − i + 1 denote the length of the subchain being multiplied. The subchains of length 1 (m[i, i]) are trivial. 
	Then we build up by computing the subchains of length 2, 3, ..., n. The final answer is m[1, n].
	Now set up the loop: Observe that if a subchain of length L starts at position i, then j = i + L − 1. 
	Since, we would like to keep j in bounds, this means we want j ≤ n, this, in turn, means that we want i + L − 1 ≤ n, 
	actually what we are saying here is that we want i ≤ n − L +1. This gives us the closed interval for i. So our loop 
	for i runs from 1 to n − L + 1.*/
	
	
	public static int matrix_result(int []p)
	{
		int i,j,k,L,q;
		int n=p.length;
		int m[][] = new int[n][n];

		for(i=1;i<n;i++)
			m[i][i]=0;
		for(L=2;L<n;L++)
		{
			for(i=1;i<n-L+1;i++)
			{
				j=i+L-1;
				m[i][j]=Integer.MAX_VALUE;
				for(k=i;k<j;k++)
				{
					q=m[i][k]+m[k+1][j]+p[i-1]*p[j]*p[k];
					if (q<m[i][j])
						m[i][j]=q;

				}
			}
		}
		return m[1][n-1];

	}
}
