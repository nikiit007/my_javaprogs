package geeks_for_geeks.bitmasking;
import java.io.*;

public class Bit_reverse
{

	public static void main(String[] args)throws IOException
	{
		int n=10;
		int temp;
		int reversed=0;
		int no_of_bits=Integer.toBinaryString(n).length();
		System.out.println(no_of_bits);
		for(int i=0;i<no_of_bits;i++)
		{
			temp=n&(1<<i);
			System.out.println(Integer.toBinaryString(temp));
			
			if(temp!=0)
			{
				reversed|=1<<(no_of_bits-1-i);
				System.out.println(Integer.toBinaryString(reversed));
			}
			System.out.println();
		}
		System.out.println(reversed);
		System.out.println(Integer.toBinaryString(reversed));
		

	}

}
