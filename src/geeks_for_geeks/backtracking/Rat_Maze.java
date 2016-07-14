package geeks_for_geeks.backtracking;
import java.io.*;
import java.util.*;


public class Rat_Maze
{
	//static int[][] arr=new int[4][4];
	static int[][] arr_sv=new int[4][4];
	static Stack<String> sv=new Stack<String>();

	public static void main(String[] args)throws IOException
	{
		int[][] arr={ 	{1, 0, 0, 0},
		        		{1, 1, 0, 1},
		        		{0, 1, 1, 0},
		        		{1, 0, 1, 1}
		    		};
		System.out.println(backtrack(0, 0, arr));
		for (String is : sv) 
		{	
			System.out.print(is+" ");
			
		}

	}
	private static boolean backtrack(int i,int j,int[][] arr)
	{
		sv.push(i+""+j);
		
		if (sv.contains("33"))
			{System.out.println("found");return true;}
		else 
		{
			if(i<3&&arr[i+1][j]==1)
				return backtrack(i+1,j,arr);
			else if(j<3&&arr[i][j+1]==1)
				return backtrack(i,j+1,arr);
			
		}
		sv.pop();
		
		System.out.println("not found");
		return false;
		
		
	}
}
