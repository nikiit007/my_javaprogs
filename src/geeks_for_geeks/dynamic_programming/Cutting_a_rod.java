package geeks_for_geeks.dynamic_programming;
import java.io.*;


public class Cutting_a_rod {

	public static void main(String[] args) throws IOException
	{
		int p[]={1,5,8,9,10,17,17,20};
		System.out.println(max_cost(p));
		

	}

	public static int max_cost(int[] p)
	{
		int n=p.length;
		int []r=new int[n+1];//why do we take and extra element , i have to understand
		int i,j,q;
		for(i=1;i<=n;i++)
		{
			q=Integer.MIN_VALUE;
			for(j=0;j<i;j++)
			{
				System.out.println("comparing"+q+" and "+"sum of"+p[j]+"and"+r[i-j-1]);
				q=Math.max(q, p[j]+r[i-j-1]);
				
			}
			r[i]=q;
			System.out.println("updated r["+i+"]with"+q);
		}
		
		for(i=0;i<n;i++)
		System.out.println(r[i]);
		
		return r[n];
	}
}
