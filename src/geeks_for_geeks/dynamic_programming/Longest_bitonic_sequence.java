package geeks_for_geeks.dynamic_programming;

import java.io.*;




public class Longest_bitonic_sequence 
{

	public static void main(String[] args) throws IOException
	{
		int arr[]={0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5,
                13, 3, 11, 7, 15};
		System.out.println(longest_bitonic(arr));

	}
	public static int longest_bitonic(int arr[])
	{
		int n=arr.length;
		int lis[]=new int[n];
		int lds[]=new int[n];
		int i,j;

		for(i=0;i<n;i++)
		{
			lis[i]=lds[i]=1;
		}

		for(i=1;i<n;i++)
		{
			for(j=0;j<i;j++)
				if((arr[i]>arr[j])&&(lis[i]<lis[j]+1))
					lis[i]=lis[j]+1;

		}
		
		for(i=n-2;i>=0;i--)
		{
			for(j=n-1;j>i;j--)
				if((arr[i]>arr[j])&&(lds[i]<lds[j]+1))
					lds[i]=lds[j]+1;

		}
		int maxm=lis[0]+lds[0]-1;
		for(i=1;i<n;i++)
			maxm=Math.max(maxm, lis[i]+lds[i]-1);
		return(maxm);



	}
}


