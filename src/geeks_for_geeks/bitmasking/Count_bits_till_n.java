package geeks_for_geeks.bitmasking;
import java.io.*;

public class Count_bits_till_n
{

	public static void main(String[] args)throws IOException
	{
		int n=98;
		System.out.println(count(n));
	}

	private static int count(int n)
	{
		
		if (n==1)
			return 1;
		else if (n==0)
			return 0;

		int b= (int) (Math.log(1.0+n*1.0)/Math.log(2.0));
		


		//getting all counts before the number of form 2^(b-1)
		int c= (int) (b*Math.pow(2.0,b-1));
		


		int to_mask= (int) (Math.pow(2.0, b));

		//what is left to be found
		n&=~to_mask;







		return (c+n+1+count(n));

	}
}
	