package codechef.june_2016;
import java.io.*;
import java.util.*;

public class CHEFARK1 
{

	public static void main(String[] args) throws IOException
	{
		Integer n,k,t;
		Reader.init(System.in);
		t=Reader.nextInt();

		while(t-->0)
		{
			n=Reader.nextInt();
			k=Reader.nextInt();
			int bit_count,count=0;
			int powval=(int) Math.pow(2.0, n*1.0)-1;
			Integer x;
			if (n==1)
				x=Integer.parseInt("0", 2);
			else if(n==2)
				x=Integer.parseInt("00", 2);
			else if(n==3)
				x=Integer.parseInt("000", 2);
			else if(n==4)
				x=Integer.parseInt("0000", 2);
			else if(n==5)
				x=Integer.parseInt("00100", 2);
			else if(n==6)
				x=Integer.parseInt("001100", 2);
			else if(n==7)
				x=Integer.parseInt("0011100", 2);
			else if(n==8)
				x=Integer.parseInt("00111100", 2);
			else if(n==9)
				x=Integer.parseInt("001111100", 2);
			else 
				x=Integer.parseInt("0011111100", 2);
			HashSet<Integer> y=new HashSet<Integer>();

			while(powval>=0)
			{
				bit_count=Integer.bitCount(powval);
				if((bit_count<=k)&&(bit_count%2==k%2))
					y.add(powval&x);


				powval--;
			}
			System.out.println(y.size());

		}

	}

}
