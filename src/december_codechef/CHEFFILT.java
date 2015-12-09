package december_codechef;
import java.io.*;
import java.util.*;
import myutil.Reader;

//BADXOR spoj

public class CHEFFILT
{

	public static void main(String[] args)throws IOException
	{
		int T;
		Reader.init(System.in);
		T=Reader.nextInt();
		while(T-->0)
		{
			String s;
			s=Reader.next();
			int S=string_to_binary(s, 'w');
			int N;
			N=Reader.nextInt();
			for(int i=0;i<N;i++)
			{
				
				
				
				
					
				
			}
		}
		
		
		
	}
	
	private static int string_to_binary(String s,char a)
	{
		char []t= s.toCharArray();
		for(int j=0;j<s.length();j++)
			if(t[j]==a)
				t[j]='1';
			else t[j]='0';
		int x = Integer.parseInt(t.toString(),2);
		return x;
	}
}
