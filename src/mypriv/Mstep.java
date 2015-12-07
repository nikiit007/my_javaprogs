package mypriv;
import java.io.*;
public class Mstep 
{
	
	
	public static void main(String args[])throws IOException
	{
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Reader.init(System.in);
		
		Integer T;
		
		T= Reader.nextInt();
		
		while(T>0)
		{
			Integer N = Reader.nextInt();
			Pair p[] = new Pair[N*N];
			Integer i,j,temp,count=0;
			
			
			
			for(i=0;i<N;i++)
				for(j=0;j<N;j++)
				{
					
					temp = Reader.nextInt();
					p[temp-1]=new Pair(i,j);
				}

			
			
			for(i=1;i<N*N;i++)
				
				{
				    count=count + Math.abs(p[i].x-p[i-1].x) + Math.abs(p[i].y-p[i-1].y);
				 
					
				}
			System.out.println(count);
			T--;
		}

	}


}
class Pair
{
	Integer x;
	Integer y;
	public  Pair(Integer x, Integer y) {
		
		this.x = x;
		this.y = y;
	}
	public Pair() {
		
	}

}
