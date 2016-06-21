package geeks_for_geeks.backtracking;
import java.io.*;
import java.util.*;
public class Knights_tour
{

	public static void main(String[] args)throws IOException
	{
		Boolean chessboard[][]=new Boolean[8][8];
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				chessboard[i][j]=false;
		backtrack(chessboard,0,0,1);

	}

	private static void backtrack(Boolean chessboard[][],int i,int j,int x)
	{
		System.out.println(i+""+j+""+x);
		if (alltrue(chessboard))
			System.out.println("yeah found");
		else if (x>8)
			return ;
		else
		{
			for(int k=1;k<9;k++)
				{
				chessboard=implement_move(chessboard, i, j, k);
				
				
				if(modify_x(i,k)!=i&&modify_y(j,k)!=j)
					backtrack(chessboard,modify_x(i,k),modify_y(j,k),k);
				
					
				
				chessboard=revert_move(chessboard, i, j, k);
				}
			
			

		}


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
	private static Boolean[][] implement_move(Boolean chessboard[][],int i,int j,int x)
	{
		switch(x)
		{
		case 1:
			i=i-2;
			j=j-1;
			break;
		case 2:
			i=i-2;
			j=j+1;
			break;
		case 3:
			i=i-1;
			j=j+2;
			break;
		case 4:
			i=i+1;
			j=j+2;
			break;
		case 5:
			i=i+2;
			j=j+1;
			break;
		case 6:
			i=i+2;
			j=j-1;
			break;
		case 7:
			i=i+1;
			j=j-2;
			break;
		default:
			i=i-1;
			j=j-2;
			break;
		}
		if((i>=0&&j>=0)&&(i<8&&j<8))
			chessboard[i][j]=true;
		return chessboard;

	}

	private static Boolean[][] revert_move(Boolean chessboard[][],int i,int j,int x)
	{
		switch(x)
		{
		case 1:
			i=i-2;
			j=j-1;
			break;
		case 2:
			i=i-2;
			j=j+1;
			break;
		case 3:
			i=i-1;
			j=j+2;
			break;
		case 4:
			i=i+1;
			j=j+2;
			break;
		case 5:
			i=i+2;
			j=j+1;
			break;
		case 6:
			i=i+2;
			j=j-1;
			break;
		case 7:
			i=i+1;
			j=j-2;
			break;
		default:
			i=i-1;
			j=j-2;
			break;
		}
		if((i>=0&&j>=0)&&(i<8&&j<8))
			chessboard[i][j]=false;
		return chessboard;

	}


}
