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
			int N;
			N=Reader.nextInt();
			for(int i=0;i<N;i++)
			{
				String temp;
				temp=Reader.next();
				char []t= temp.toCharArray();
				for(int j=0;j<temp.length();j++)
					if(t[i]=='+')
						t[i]='0';
					else t[i]='1';
				
					
				
			}
		}
		
		
		
	}
	
}
