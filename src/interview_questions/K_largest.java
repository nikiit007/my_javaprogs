package interview_questions;
import java.io.*;
import java.util.*;


public class K_largest 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int T,N,k;
		T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			String []vals=br.readLine().split(" ");
			N=Integer.parseInt(vals[0]);
			System.out.println("value of N="+N);
			k=Integer.parseInt(vals[1]);
			System.out.println("value of k="+k);
			PriorityQueue<Integer> top_five= new PriorityQueue<Integer>();
			vals=br.readLine().split(" ");
			for(int i=0;i<N;i++)
			{
				top_five.add(Integer.parseInt(vals[i]));
			}
			
			for (Integer i : top_five) 
			{
				System.out.println(i);
				
			}
		}
		
		

	}

}
