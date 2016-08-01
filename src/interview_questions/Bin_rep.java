package interview_questions;
import java.io.*;
import java.lang.*;

public class Bin_rep {

	public static void main(String[] args)throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int n;
			n=Integer.parseInt(br.readLine());
			System.out.println(String.format("%14s", Integer.toBinaryString(n)).replace(' ', '0'));
		}

	}

}
