package geeks_for_geeks.bitmasking;
import java.io.*;
public class find_two_non_repeating 
{

	public static void main(String[] args)throws IOException
	{
		int arr[]={2, 4, 7, 9, 2, 4};
		find_not_repeating(arr);


	}

	private static void find_not_repeating(int[] arr) 
	{
		int xor,x,y,last_bit;
		xor=x=y=last_bit=0;

		for (int i : arr)
			xor^=i;
		last_bit=xor&~(xor-1);
		for (int i : arr) 
		{
			if((i&last_bit)==0)
				x^=i;
			else 
				y^=i;
		}
		System.out.println(x+" "+y);
	}

}
