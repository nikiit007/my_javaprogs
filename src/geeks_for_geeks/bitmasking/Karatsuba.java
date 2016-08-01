package geeks_for_geeks.bitmasking;
import java.io.*;


public class Karatsuba
{

	public static void main(String[] args)throws IOException
	{
		int x=450;
		int y=789;
		
		System.out.println(K_mult(x,y));
		

		
		
		


	}
	private static int K_mult(int x, int y)
	{
		if(x==0||y==0)
			return 0;
		else if(x==1)
			return y;
		else if(y==1)
			return x;
		int xl,xr,yl,yr,xlyl,xryr;
		int val;
		String pad_info=pad(x,y);
		String X= String.format(pad_info, Integer.toBinaryString(x)).replace(' ', '0');
		String Y= String.format(pad_info, Integer.toBinaryString(y)).replace(' ', '0');

		
		int n=X.length();
		xl=x>>(n/2);
		yl=y>>(n/2);
		xr=x&((1<<(n/2))-1);
		yr=y&((1<<(n/2))-1);
		xlyl=K_mult(xl,yl);
		xryr=K_mult(xr,yr);
		
		val=(int) (Math.pow(2.0, n)*xlyl+Math.pow(2.0, n/2.0)*(K_mult((xl+xr),(yl+yr))-xlyl-xryr) +xryr);
		return val;
	
		//return y;
		
	}
	private static String pad(int x, int y)
	{
		String X,Y;
		X=Integer.toBinaryString(x);
		Y=Integer.toBinaryString(y);
		int max_len=Math.max(X.length(), Y.length());
		if(max_len%2==0)
			return "%"+max_len+"s";
		else
			return "%"+(max_len+1)+"s";
	}

}
