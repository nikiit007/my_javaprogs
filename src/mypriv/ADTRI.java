package mypriv;
import java.io.*;
import java.util.*;


public class ADTRI {

	public static void main(String[] args) throws IOException
	{
		Integer i,j;
		Integer T,N;

		Set<Integer> s=new TreeSet<Integer>();

		Integer Z1=5000000;

		Integer Z =(int) Math.sqrt(Z1);
		Integer temp;
		for(i=1;i<=Z+1;i++)
			for(j=i+1;j<=Z+1;j++)
			{


				temp=i*i+j*j;

				if(temp<=Z1)
					s.add(temp);


			}


		//System.out.println(s.size());
		Reader.init(System.in);
		int flag;
		T= Reader.nextInt();
		while(T-->0)
		{
			N=Reader.nextInt();
			flag=0;
			/*while(N%2==0)
				N=N/2;
			flag=0;
			if(s.contains(N))
				flag=1;
			for(i=3;i<=Math.sqrt(N);i=i+2)
				if((N%i)==0 && (s.contains(N/i)||s.contains(i)))
				{flag=1;break;}*/
			
			for (Integer ik : s) 
			{
				//System.out.println(ik);
				if(ik>N)
					break;
				if((N%ik==0))
					{flag=1;break;}
		    }
			if(flag==1)
				System.out.println("YES");
			else 
				System.out.println("NO");


		}


	}

}
