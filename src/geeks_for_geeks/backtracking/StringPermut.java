package geeks_for_geeks.backtracking;
import java.io.*;
import java.util.*;

public class StringPermut
{

	public static void main(String[] args)
	{
		char x[]={'A','B','C'};
		permut(x,0,2);

	}
	
	private static void permut(char[] val,int l,int r)
	{
		if(l==r)
			System.out.println(val);
		else
		{
			for(int i=l;i<=r;i++)
			{
				swap(val,l,i);
				permut(val,l+1,r);
				swap(val,l,i);
			}
		}
		
	}
	
	
	
	private static char[] swap(char []val, int x , int y)
	{
		char temp;
		temp=val[x];
		val[x]=val[y];
		val[y]=temp;
		
		return val;
		
	}
}
