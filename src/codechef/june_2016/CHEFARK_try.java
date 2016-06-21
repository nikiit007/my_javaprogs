package codechef.june_2016;
import java.io.*;
import java.util.*;

/*These are Hogben's central polygonal numbers with the (two-dimensional) symbol
2*/


public class CHEFARK_try 
{

	public static void main(String[] args) throws IOException 
	{
		//int n,k;
		/*for(int n=1;n<=10;n++)
			for(int k=1;k<=10;k++)
			{

				int temp_n1=n;

				ArrayList<Integer> a=new ArrayList<Integer>();

				HashSet<String> x= new HashSet<String>();
				while(temp_n1-->0)
					a.add((temp_n1%2==0)?1:-1);
				System.out.println(permut(a,k,x));
			}*/
		
		int n=3,k=2;
		int temp_n1=n;
		ArrayList<Integer> a=new ArrayList<Integer>();

		HashSet<String> x= new HashSet<String>();
		while(temp_n1-->0)
			a.add(1);
		System.out.println(permut(a,k,x));
		
		for (String str : x) 
		{
			System.out.println(str);
			
		}
	}




private static int permut(ArrayList<Integer> a, int k, HashSet<String> x)
{
	if(k>0)
		for(int m=0;m<a.size();m++)
		{
			a.set(m, -a.get(m));

			
			permut(a,k-1,x);
			x.add(a.toString());
			a.set(m, -a.get(m));
		}
	
	return x.size();


}

}


/*for(int i=0;i<a.size();i++)
{
	a.set(i, -a.get(i));
	for(int j=0;j<a.size();j++)
	{
		a.set(j, -a.get(j));
		for(int k=0;k<a.size();k++)
		{
			a.set(k, -a.get(k));
			for(int l=0;l<a.size();l++)
			{
				a.set(l, -a.get(l));
				for(int m=0;m<a.size();m++)
				{
					a.set(m, -a.get(m));
					x.add(a);
					a.set(m, -a.get(m));
				}
				a.set(l, -a.get(l));
			}
			a.set(k, -a.get(k));
		}
		a.set(j, -a.get(j));
	}
	a.set(i, -a.get(i));
}*/
