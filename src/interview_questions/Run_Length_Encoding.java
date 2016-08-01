package interview_questions;
import java.util.*;

public class Run_Length_Encoding 
{

	public static void main(String[] args)
	{
		String str="aaaabbbccc";
		System.out.println(str);
		System.out.println(encode(str));

	}
	static String encode(String str)
	{
		String res="";
		Character c;
		Character prev;
		int n=1;
		prev=str.charAt(0);
		for(int i=1;i<str.length();i++)
		{

			c=str.charAt(i);
		
			
			if(!prev.equals(c))
			{
				res=res+prev+n;
				
				n=1;
			}
			else
				n++;

			prev=str.charAt(i);
		}
		res=res+prev+n;


		return res;

	}

}
