package november_codechef;
import java.io.*;
import java.util.*;
import myutil.Reader;


public class KFUNC
{

	public static void main(String[] args) 
	{
		Digit x= new Digit(234);
		Digit y= new Digit(7);
		Digit z= new Digit(674);
		Digit p= new Digit(838);
		
		Digit opo=Digit.sum(x, y, (int) Math.pow(10, 18));
		Digit.print(opo);
		
	}

}
class Digit
{
	long N;
	int []arr =new int[40];

	public Digit(long n)
	{
		super();
		N = n;
		for(int j=0;j<40;j++)
		{
			arr[j]=0;
		}
		long temp =N;
		int i=0;
		while(temp>0)
		{
			arr[i++]=(int) (temp%10);
			temp=temp/10;
		}

	}
	
	public static void print(Digit x) 
	{
		String z="";
		int i=0;
		for(i=0;i<40;i++)
		{
			z=x.arr[i]+""+z;
			
		}
		System.out.println(z);
	}

	public Digit()
	{
		
	}

	public static Digit sum(Digit x,Digit y,long n)
	{
		int i;
		Digit z = new Digit();
		int arr3[]= new int[40];
		int oldarr3=0;
		for(i=0;i<40;i++)
			arr3[i]=0;
		for(i=0;i<39;i++)
		{
			oldarr3=z.arr[i];
			z.arr[i]=(int) ((z.arr[i]+n*x.arr[i]+(n*(n-1)*y.arr[i])/2)%10);
			z.arr[i+1]+=(oldarr3+n*x.arr[i]+(n*(n-1)*y.arr[i])/2)/10;
			
		}
		return z;
		
		
	}
}





