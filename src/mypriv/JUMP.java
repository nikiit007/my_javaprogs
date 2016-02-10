package mypriv;

import java.io.*;
import java.util.*;

public class JUMP
{

	public static void main(String[] args) throws IOException
	{
		int N;
		int i,j;
		Reader.init(System.in);
		N=Reader.nextInt();

		int P[]=new int[N];
		long A[]=new long[N];
		int H[]=new int[N];
		long min_energy[]= new long[N];


		for(i=0;i<N;i++)
			P[i]=Reader.nextInt();

		for(i=0;i<N;i++)
			A[i]=Reader.nextLong();

		for(i=0;i<N;i++)
			H[i]=Reader.nextInt();

		//min_energy[N-1]=Long.MAX_VALUE;
		for(i=0;i<N;i++)
		{
			if(P[N-1]>P[i])
				min_energy[i]=A[N-1]+A[i]+(H[N-1]-H[i])*(H[N-1]-H[i]);
			else
				min_energy[i]=2*1000000000*36*1000000000;
		}

		/*for(i=0;i<N;i++)
		{
			System.out.print(min_energy[i]+" ");
		}*/
		//System.out.println();

		for(i=N-2;i>=0;i--)
		{
			//System.out.println("comparing "+i +" with");
			for(j=i+1;j<N;j++)
			{
				//System.out.print(" "+j);
				if(P[i]<P[j])
					min_energy[i]=Math.min(A[j]+A[i]+(H[j]-H[i])*(H[j]-H[i])+min_energy[j], min_energy[i]);
			}
			/*else 
				min_energy[i]=Long.MAX_VALUE;

			 */
			/*System.out.println();
			System.out.println("updated min energy["+i+"] "+min_energy[i]);*/
		}

		System.out.println(min_energy[0]);


	}

}
