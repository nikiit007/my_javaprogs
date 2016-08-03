package interview_questions;
import java.io.*;
import java.util.*;

public class Jumping_nos 
{
	static boolean a[]=new boolean[100000];

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int n=Integer.parseInt(br.readLine());
			a=new boolean[100000];
			for(Integer i=0;i<=9;i++)
				jump_gen(i.toString(),n);
			System.out.println();
		}
		

		/*for(int k=0;k<50;k++)
			if(a[k]==true)
				System.out.println(k);*/

	}
	private static void jump_gen(String x,int n)
	{
		int y;
		y=Integer.parseInt(x);
		if (y>n)
			return;
		if(a[y]==true)
			return;
		else
		{
			a[y]=true;
			System.out.print(y+" ");
			
			if(y!=0)jump_gen(x+(y-1),n);
			if(y!=9)jump_gen(x+(y+1),n);
		}


	}

}
