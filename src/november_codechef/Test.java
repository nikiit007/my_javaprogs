
package november_codechef;
import java.io.*;
import java.util.*;
import myutil.Reader;
import myutil.Prime;
 
 
 
 
class Test {
 
	public static void main(String[] args) throws IOException
	{
		int n,i;
		Reader.init(System.in);
		n=Reader.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print(n/gcd(i,n)+" ");
			
		}
		System.out.println();
		
		
 
 
	}
	private static int gcd(int n, int m) 
	{
		if (m==0)
			return n;
		else 
			return(gcd(m,n%m));
	}
}
