

import java.io.*;
import java.util.*;



public class PLANEDIV
{

	public static void main(String[] args)throws IOException
	{
		int T;
		Reader.init(System.in);
		PrintWriter out = new PrintWriter(System.out);
		T=Reader.nextInt();
		while(T-- >0)
		{
			int N;
			N=Reader.nextInt();
			TreeSet<String> x =new TreeSet<String>();
			TreeSet<String> y =new TreeSet<String>();



			for(int i=0;i<N;i++)
			{
				int A,B,C,gcdab;
				A=Reader.nextInt();
				B=Reader.nextInt();
				C=Reader.nextInt();
				if (A<0)
				{
					A=Math.abs(A);
					B=-B;
					C=-C;
				}
				else if (A==0)
				{
					if (B<0)
					{
						B=Math.abs(B);
						C=-C;
					}

				}
				if ((A==0)||(B==0))
					gcdab=(B==0)?Math.abs(A):Math.abs(B);
					else
						gcdab = gcd(Math.abs(A),Math.abs(B));

				x.add(new String(A/gcdab+""+B/gcdab+","+C*1.00000000/gcdab));
				y.add(new String(A/gcdab+""+B/gcdab));
			}

			ArrayList<String> st = new ArrayList<String>();
			for (String str : x) 
			{
				st.add(str.substring(0, str.indexOf(",")));

			}
			
			int maxcount=0,tempcount=0;

			String tempstring=st.get(0);

			for (String string : st) 
			{
				
				if (tempstring.equals(string))
				{
					tempcount++;
				}

				else
				{
					tempstring=string;
					tempcount=1;
				}

				if(tempcount>maxcount)
					maxcount=tempcount;



			}

			out.println(maxcount);
		}

		out.flush();
		out.close();




	}

	private static int gcd(int n, int m) 
	{
		if (m==0)
			return n;
		else 
			return(gcd(m,n%m));
	}

}
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    public static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    public static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    public static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
    
    public static long nextLong() throws IOException {
		return Long.parseLong( next() );
	}
	
    public static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}