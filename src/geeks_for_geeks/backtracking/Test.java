package geeks_for_geeks.backtracking;

import java.io.*;

import java.util.Stack;

class Test
{
	static int N=8;
	static Stack<String> sv=new Stack<String>(); 
	static Boolean board[][]=new Boolean[N][N];
	public static void main(String[] args)
	{

		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				board[i][j]=false;


		fill_all(3,3);
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{	
				if (board[i][j])
					System.out.print("1 ");
				else 
					System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println();
		remove_all(3,3);
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{	
				if (board[i][j])
					System.out.print("1 ");
				else 
					System.out.print("0 ");
			}
			System.out.println();
		}
		


	}
	private static void backtrack(int i,int j) 
	{

		for (String str : sv) 
		{
			System.out.print(str+" ");

		}
		System.out.println();

		if(i>=N-1)
		{
			return;

		}
		else 
		{
			sv.push(i+""+j);



			fill_all(i,j);
			for(int k=0;k<N;k++)
			{
				if(!board[i+1][k])
					backtrack(i+1,k);
			}

			sv.pop();
			remove_all(i,j);
		}

	}
	private static void fill_all(int i,int j)
	{
		int k;
		int temp_i,temp_j;
		//filling all rows
		for(k=0;k<N;k++)
			board[i][k]=true;
		//filling all columns
		for(k=0;k<N;k++)
			board[k][j]=true;
		//filling both lower diagonals
		temp_i=i;temp_j=j;
		while(temp_i<N&&temp_j<N)
		{
			board[temp_i++][temp_j++]=true;
		}

		temp_i=i;temp_j=j;
		while(temp_i<N&&temp_j>=0)
		{
			board[temp_i++][temp_j--]=true;
		}
	}

	private static void remove_all(int i,int j)
	{
		int k;
		int temp_i,temp_j;
		//filling all rows
		for(k=0;k<N;k++)
			board[i][k]=false;
		//filling all columns
		for(k=0;k<N;k++)
			board[k][j]=false;
		//filling both lower diagonals
		temp_i=i;temp_j=j;
		while(temp_i<N&&temp_j<N)
		{
			board[temp_i++][temp_j++]=false;
		}

		temp_i=i;temp_j=j;
		while(temp_i<N&&temp_j>=0)
		{
			board[temp_i++][temp_j--]=false;
		}
	}
}
