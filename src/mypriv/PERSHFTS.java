/*package mypriv;
import java.io.*;
import java.util.*;


public class PERSHFTS {

	public static void main(String[] args)
	{
		
	}
	private static int[] int2num(int n,int alpha)
	{	
		int A[] = new int[n-1];
		for(int i=0;i<=n-2;i++)
		{
			A[i]= alpha%(n-i);
			alpha= alpha/(n-i);
			
		}
		return A;
		
	}
	private static int num2int(int n, int[]A)
	{
		int alpha=0;
		int base=1;
		for(int i=0;i<=n-2;i++)
		{
			alpha +=A[i]*base;
			base =base * (n-i);
			
			
		}
		return alpha;
		
	}
	private static int[] circ(int m,int k,int p[])
	{
		int c;
		for(int i=1;i<=k;i++)
		{
			c=p[1];
			for(int j=2;j<=m;j++)
			{
				p[j-1]=p[j];
				
			}
			p[m]=c;
		}
		return p;
		
	}
	
	private static int pos(int m, int[] p)
	{
		for(int j=1;j<=m;j++)
		{
			if(p[j]==x[m])
				return m-j;
		}
	}
	
	private static int[] perm2rank(int n,int[]p)
	{
		int A[]=new int[n-1];
		int alpha;
		for(int i=0;i<=n-2;i++)
		{
			int m=n-i;
			A[i]=pos(m,p);
			p=circ(m,m-A[i],p);
		}
		alpha = num2int(n,A);
		return A;
	}
	private static int[] rank2perm(int n, int alpha,int x[])
	
	{
		int []A = int2num(n,alpha);
		int p[]=x;
		for(int i=n-2;i>=0;i--)
		{
			int m=n-i;
			p=circ(m,A[i],p+x);
		}
		return p;
		
	}
	private static void setperm(int n)
	{
		int[] p;
		for(int alpha =0;alpha<=fact(n)-1;alpha++)
			 {
				p=rank2perm(n,alpha);
				System.out.print(p);
			 }
		
		
			
	}
	private static int fact(int n) {
		int fac=1;
		
		for(int i=1;i<=n;i++)
			fac *=i;
			
		return fac;
	}
	
	
}
*/