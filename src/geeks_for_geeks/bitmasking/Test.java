package geeks_for_geeks.bitmasking;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test 
{

	/*public static void main(String[] args)//what does arg[] stand for , can i print it 
	{
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(34);
		vec.add(45);
		vec.add(52);
		vec.add(78);
		System.out.println(vec.get(3));
		
		
		int x=52;
		int xl=x>>(3);
		
		int xr=x&((1<<3)-1);
		
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(xl));
		System.out.println(Integer.toBinaryString(xr));
		
		Integer x=400;
		Integer y=400;
		System.out.println(x.compareTo(560));
		System.out.println(args[0]);
		
		
		
		//System.out.println(Integer.toBinaryString(-x));
		System.out.println(Integer.toBinaryString(x-1));
		int k=x&(x-1);
		System.out.println(Integer.toBinaryString(k));
		//System.out.println(Integer.parseInt("18",2));
		//System.out.println(parity_check(13));
	
		//System.out.println(x && !(x&(x-1)));
		
		
		
		
	}*/
	
	
	/*public static void main(String args[])
	{
		// Create a pattern to be searched
		Pattern pattern = Pattern.compile("gea*");

		// Search above pattern in "geeksforgeeks.org"
		Matcher m = pattern.matcher("geeksforgeeks.org");

		// Print starting and ending indexes of the pattern
		// in text
		while (m.find())
			System.out.println("Pattern found from " + m.start() +
							" to " + (m.end()-1));
		//System.out.println(m);
	}*/
	
	
	public static void main (String[] args)throws IOException
	{
	 int T, N;
	 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 T=Integer.parseInt(br.readLine());
	 while(T-->0)
	 {
	     int xor_val=0;
	     N=Integer.parseInt(br.readLine());
	     String vals[]=br.readLine().split(" ");
	     for(int i=0;i<N;i++)
	     {
	         
	         xor_val^=Integer.parseInt(vals[i]);
	     }
	     System.out.println(xor_val);
	 }
	}
	private static boolean ispower_2(int x)
	{
		if (x==0)
			return false;
		if((x&(-x))==x)
			return true;
		else 
			return false;
			
			
	}
	
	private static boolean parity_check(int n)
	{
		boolean parity=false;
		while(n!=0)
		{
			System.out.println(Integer.toBinaryString(n));
			parity=!parity;
			n=n&(n-1);
		}
		return parity;
		
	}

}
