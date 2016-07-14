package geeks_for_geeks.bitmasking;
import java.io.*;


public class elements_appear_thrice 
{

	public static void main(String[] args)throws IOException
	{
		int arr[]={2,2,2,4,4,4,7};
		int ones,twos,not_threes;
		ones=twos=not_threes=0;
		
		for(int i=0;i<arr.length;i++)
		{
			twos|=ones&arr[i];
			ones^=arr[i];
			not_threes=~(ones&twos);
			ones&=not_threes;
			twos&=not_threes;
			
		}
		System.out.println(ones);
	}

}
