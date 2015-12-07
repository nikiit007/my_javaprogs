package myutil;


import java.io.*;
import java.util.*;



/** Class for buffered reading int and double values */
public class Reader {
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
