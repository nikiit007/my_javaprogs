package codechef.june_2016;
import java.io.*;

public class BINOP 
{

	public static void main(String[] args) throws IOException
	{
		int T;
		String A,B;
		Reader.init(System.in);
		T=Reader.nextInt();
		while(T-->0)
		{
			A=Reader.next();
			B=Reader.next();
			int i=0;
			int ones=0;
			int zeros=0;
			int swaps=0;
			int total=0;
			int count[]=new int[2];
			

			while(i<A.length())
			{
				if(A.charAt(i)!=B.charAt(i))
				{
					if(A.charAt(i)=='0')
						ones++;
					else
						zeros++;

				}
				
				count[A.charAt(i)-48]++;
				i++;
			}

			swaps=Math.min(ones, zeros);

			ones=ones-swaps;
			zeros=zeros-swaps;
			total=ones+zeros+swaps;
			
			if(count[0]==A.length()||count[1]==A.length())
				System.out.println("Unlucky Chef");
			else
			{
				System.out.println("Lucky Chef");
				System.out.println(total);
			}




		}
	}

}
