package geeks_for_geeks.dynamic_programming;

import java.io.IOException;

public class Dynamic_LIS
{

	public static void main(String[] args)throws IOException
	{
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of LIS is "+ lis( arr, n ));



	}
	private static int lis(int arr[],int n)
	{
		int lis[]=new int[n];

		int i,j,max=0;
		for(i=0;i<n;i++)
			lis[i]=1;

		for(i=1;i<n;i++)
			for(j=0;j<i;j++)
			{
				if((arr[i]>arr[j])&&(lis[i]<lis[j]+1))
					lis[i]=lis[j]+1;
				print_array(lis);
			}

		for(i=0;i<n;i++)
			if(max<lis[i])
				max=lis[i];



		return max;

	}
	private static void print_array(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

}
