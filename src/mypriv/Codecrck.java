package mypriv;
import java.io.*;


class Codecrck 
{

	public static void main(String args[])throws IOException
	{


		Matrix V= new Matrix(-.793353340291235,.608761429008721,.608761429008721,.793353340291235);


		Long i,k,s,diff;
		Long a_i,b_i;
		Reader.init(System.in);
		i=Reader.nextLong();
		k=Reader.nextLong();
		s=Reader.nextLong();
		a_i=Reader.nextLong();
		b_i=Reader.nextLong();

		diff = 2*k-2*i-s;


		Matrix D= new Matrix(Math.pow(-1.0, (k-i)*1.0)*Math.pow(2.0, diff*1.0),0.0,0.0,Math.pow(2.0, diff*1.0));
		Matrix C = new Matrix();
		C=C.mult(D, V);
		C=C.mult(V, C);
		Double Q = new Double("0");
		Q=	C.a11*a_i + C.a12*b_i +C.a21*a_i+C.a22*b_i;
		System.out.println(Q);
		System.exit(0);
	}
}


class Matrix
{
	Double a11,a12,a21,a22;

	public Matrix(Double a11, Double a12, Double a21, Double a22) {
		super();
		this.a11 = a11;
		this.a12 = a12;
		this.a21 = a21;
		this.a22 = a22;
	}

	public Matrix() {

	}


	public Matrix mult(Matrix A,Matrix B)
	{
		Matrix C = new Matrix(0.0,0.0,0.0,0.0);

		C.a11 = A.a11*B.a11 + A.a12*B.a21;				
		C.a12 = A.a11*B.a12 + A.a12*B.a22;	
		C.a21 = A.a21*B.a11 + A.a22*B.a21;	
		C.a22 = A.a21*B.a12 + A.a22*B.a22;	

		return C;


	}
	public void print()
	{
		System.out.println(a11+ " "+a12);
		System.out.println(a21+ " "+a22);
	}

}

/*class Reader {
	static BufferedReader reader;
	static StringTokenizer tokenizer;

	*//** call this method to initialize reader for InputStream *//*
	static void init(InputStream input) {
		reader = new BufferedReader(
				new InputStreamReader(input) );
		tokenizer = new StringTokenizer("");
	}

	*//** get next word *//*
	static String next() throws IOException {
		while ( ! tokenizer.hasMoreTokens() ) {
			//TODO add check for eof if necessary
			tokenizer = new StringTokenizer(
					reader.readLine() );
		}
		return tokenizer.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt( next() );
	}
	
	static long nextLong() throws IOException {
		return Long.parseLong( next() );
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble( next() );
	}
}
*/