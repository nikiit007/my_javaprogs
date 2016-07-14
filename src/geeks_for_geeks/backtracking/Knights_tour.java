package geeks_for_geeks.backtracking;
/*The time complexity for this solutin is very high 8^(2^n)*/
import java.io.*;
import java.util.*;
public class Knights_tour
{
	static Stack<String> solution_vector=new Stack<String>(); 

	public static void main(String[] args)throws IOException
	{
		Boolean chessboard[][]=new Boolean[8][8];
	
		
				for(int i=0;i<8;i++)
					for(int j=0;j<8;j++)
						chessboard[i][j]=false;
				solution_vector.clear();
				backtrack(chessboard,0,0);
				
			
		

	}

	private static void backtrack(Boolean chessboard[][],int i,int j)
	{
		
		if (alltrue(chessboard))
			{
			System.out.println("yeah found");
			//return true;
			}
		
		else
		{
			chessboard[i][j]=true;
			solution_vector.push("("+i+","+j+")");
			//System.out.println("("+i+","+j+")");
			for(int k=1;k<9;k++)
				{
				
			
				
					
					
				
					//System.out.println(i+""+j+""+k);
				   
				if((modify_x(i,k)!=i&&modify_y(j,k)!=j)&&(!chessboard[modify_x(i,k)][modify_y(j,k)]))
					backtrack(chessboard,modify_x(i,k),modify_y(j,k));
				
				
				}
			/*for(int l=1;l<9;l++)
				solution_vector.remove(i+""+j+""+l);*/
			for (String str : solution_vector) 
			{
				System.out.print(str+" ");
				
			}
			System.out.println();
			solution_vector.pop();
			if (solution_vector.empty())
				System.out.println("no solution");
			chessboard[i][j]=false;

		}
		//return false;


	}



	private static Boolean alltrue(Boolean chessboard[][])
	{
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				if (!chessboard[i][j])
					return false;
		return true;

	}

	private static int modify_x(int i,int x)
	{
		int temp;
		switch(x)
		{
		case 1:
			temp=i-2;
			break;
		case 2:
			temp=i-2;
			break;
		case 3:
			temp=i-1;
			break;
		case 4:
			temp=i+1;
			break;
		case 5:
			temp=i+2;
			break;
		case 6:
			temp=i+2;
			break;
		case 7:
			temp=i+1;
			break;
		default:
			temp=i-1;
			break;
		}
		if(temp<8&&temp>=0)
			return temp;
		else
			return i;
	}

	private static int modify_y(int j,int x)
	{
		int temp;
		switch(x)
		{
		case 1:

			temp=j-1;
			break;
		case 2:

			temp=j+1;
			break;
		case 3:

			temp=j+2;
			break;
		case 4:

			temp=j+2;
			break;
		case 5:

			temp=j+1;
			break;
		case 6:

			temp=j-1;
			break;
		case 7:

			temp=j-2;
			break;
		default:

			temp=j-2;
			break;
		}

		if(temp<8&&temp>=0)
			return temp;
		else
			return j;

	}
	

}
