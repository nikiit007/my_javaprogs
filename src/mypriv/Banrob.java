package mypriv;

import java.io.*;


class Banrob {

	public static void main(String[] args) throws IOException {
		Long D = 1000000000L;
		Double p,calc;
		Integer T;		
		Reader.init(System.in);
		
		T = Reader.nextInt();
		Long M;
		
		while(T-->0)
		{
			calc=0.0;
			M=Reader.nextLong();
			p=Reader.nextDouble();
			calc = (1-Math.pow(-p, M-1))/(1+p);
			calc = D*p*calc;
			System.out.println(D-calc+" "+calc);
				

		}

	}

}
