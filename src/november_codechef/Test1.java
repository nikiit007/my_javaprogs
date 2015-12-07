package november_codechef;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import myutil.Prime;

public class Test1 {

	public static void main(String[] args) throws IOException
	{
		int i;
		PrintWriter out = new PrintWriter(System.out);
		int n= 10000000-2;
		int MAX = (int) (n+4);
		HashMap<Integer,Integer> x=new HashMap<Integer,Integer>();
		long[] sp=new long[MAX];
		sp=Prime.shortest_prime(MAX);
		x=Prime.generate_primefactors_and_powers(n, sp);
		
		long prod=1L;
		for(Map.Entry<Integer, Integer> entry :x.entrySet())
		{

			out.println(entry.getKey()+" "+entry.getValue());
			prod*=(long)(Math.pow(entry.getKey(), 2*entry.getValue()+1)+1)/(long)(entry.getKey()+1);
		}

		out.println(Math.pow(4999999, 3));
		out.println(n);
		out.println(prod);
		
		out.flush();out.close();

	}

}
