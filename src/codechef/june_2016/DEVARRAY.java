package codechef.june_2016;
import java.io.*;
import java.util.*;


public class DEVARRAY 
{

	public static void main(String[] args)throws IOException
	{
		int N,Q,t;
		Reader.init(System.in);
		N=Reader.nextInt();
		Q=Reader.nextInt();
		ArrayList<Integer> A=new ArrayList<Integer>();
		
		for(int i=0;i<N;i++)
			A.add(Reader.nextInt());
		
		int max_val=Collections.max(A);
		int min_val=Collections.min(A);
		
		while(Q-->0)
		{
			t=Reader.nextInt();
			if(t<=max_val && t>=min_val)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
		
		
		

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