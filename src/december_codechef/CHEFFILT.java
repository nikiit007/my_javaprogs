package december_codechef;
import java.io.*;
import java.util.*;
import myutil.Reader;

//BADXOR spoj

public class CHEFFILT
{
	public static final int mod =1000000007;

	public static void main(String[] args)throws IOException
	{
		int T;
		Reader.init(System.in);
		T=Reader.nextInt();
		int i,j;
		while(T-->0)
		{

			int S=string_to_binary(Reader.next(), 'w');
			int N;
			N=Reader.nextInt();
			int A[]=new int[N];
			
			for(i=0;i<N;i++)
				A[i]=string_to_binary(Reader.next(), '+');
			
			int dp[][]=new int[N][1024];
			dp[0][0]=1;

			for(i=1;i<N;i++){
				int a = A[i-1];
				for(j=0;j<1024;j++){
					dp[i][j] = dp[i-1][j] + dp[i-1][j^a];
					if(dp[i][j]>=mod)
						dp[i][j] -= mod;
				}
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
