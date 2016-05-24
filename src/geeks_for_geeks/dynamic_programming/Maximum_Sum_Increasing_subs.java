package geeks_for_geeks.dynamic_programming;

import java.io.*;




public class Maximum_Sum_Increasing_subs 
{

	public static void main(String[] args) throws IOException
	{
		int arr[]={1, 101, 2, 3, 100, 4, 5,10,105,108,112,45,78,90,80,113};
		System.out.println(max_sum(arr));

	}
	public static int max_sum(int arr[])
	{
		int n=arr.length;
		int ms[]=new int[n];
		int i,j;

		for(i=0;i<n;i++)
			ms[i]=arr[i];

		for(i=1;i<n;i++)
		{
			for(j=0;j<i;j++)
				if((arr[i]>arr[j])&&(ms[i]<ms[j]+arr[i]))
					ms[i]=ms[j]+arr[i];

		}
		int maxm=0;
		/*for(i=0;i<n;i++)
			System.out.print(ms[i]+" ");*/

		for(i=0;i<n;i++)
			maxm=Math.max(maxm, ms[i]);
		return(maxm);



	}
}


