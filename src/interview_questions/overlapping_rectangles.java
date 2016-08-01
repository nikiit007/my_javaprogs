package interview_questions;
import java.io.*;
import java.util.*;


public class overlapping_rectangles 
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			Rectangle R1 = new Rectangle();
			Rectangle R2 = new Rectangle();
			String []nums;

			nums=br.readLine().split(" ");
			R1.x1=Integer.parseInt(nums[0]);
			R1.y1=Integer.parseInt(nums[1]);
			R1.x2=Integer.parseInt(nums[2]);
			R1.y2=Integer.parseInt(nums[3]);

			nums=br.readLine().split(" ");
			R2.x1=Integer.parseInt(nums[0]);
			R2.y1=Integer.parseInt(nums[1]);
			R2.x2=Integer.parseInt(nums[2]);
			R2.y2=Integer.parseInt(nums[3]);
			
			System.out.println(overlap(R1,R2));


		}


	}
	private static int overlap(Rectangle R1,Rectangle R2)
	{
		if(R1.x1>R2.x2 || R2.x1>R1.x2)
			return 0;
		else if (R1.y1<R2.y2 || R2.y1<R1.y2)
			return 0;
		else
			return 1;

	}


}
class Rectangle
{
	int x1,y1,x2,y2;

	public Rectangle(int x1, int y1, int x2, int y2)
	{
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public Rectangle()
	{

	}



}