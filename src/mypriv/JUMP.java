/*package mypriv;


import java.util.*;
import java.io.*;


class Vertex implements Comparable<Vertex>
{
	//public final String name;
	public Edge[] adjacencies;
	public double minDistance = Double.POSITIVE_INFINITY;
	public Vertex previous;
	  public Vertex(String argName) { name = argName; }
    public String toString() { return name; }
	public int compareTo(Vertex other)
	{
		return Double.compare(minDistance, other.minDistance);
	}

}


class Edge
{
	public final Vertex target;
	public final double weight;
	public Edge(Vertex argTarget, double argWeight)
	{ target = argTarget; weight = argWeight; }
}

public class JUMP
{
	public static void computePaths(Vertex source)
	{
		source.minDistance = 0.;
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
		vertexQueue.add(source);

		while (!vertexQueue.isEmpty()) {
			Vertex u = vertexQueue.poll();

			// Visit each edge exiting u
			for (Edge e : u.adjacencies)
			{
				Vertex v = e.target;
				double weight = e.weight;
				double distanceThroughU = u.minDistance + weight;
				if (distanceThroughU < v.minDistance) {
					vertexQueue.remove(v);

					v.minDistance = distanceThroughU ;
					v.previous = u;
					vertexQueue.add(v);
				}
			}
		}
	}

	public static List<Vertex> getShortestPathTo(Vertex target)
	{
		List<Vertex> path = new ArrayList<Vertex>();
		for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
			path.add(vertex);

		Collections.reverse(path);
		return path;
	}

	public static void main(String[] args) throws IOException
	{
		// mark all the vertices 
		int N;
		int i,j;
		Reader.init(System.in);
		N=Reader.nextInt();

		int P[]=new int[N];
		long A[]=new long[N];
		int H[]=new int[N];
		Vertex V[]=new Vertex[N];
		
		for(i=0;i<N;i++)
			P[i]=Reader.nextInt();
		
		for(i=0;i<N;i++)
			A[i]=Reader.nextLong();
		
		for(i=0;i<N;i++)
			H[i]=Reader.nextInt();
		
		

		
		
		for(i=0;i<N;i++)
			{
			V[i]=new Vertex();
			V[i].adjacencies= new Edge[N];
			
			}

		for(i=0;i<N;i++)
			for(j=0;j<N;j++)
			{
				if((j<=i)||(P[i]>P[j]))
					V[i].adjacencies[j]= new Edge(V[j],Double.POSITIVE_INFINITY);
				
				else	
				V[i].adjacencies[j]= new Edge(V[j],A[j]+(H[j]-H[i])*(H[j]-H[i]));
			}





		// set the edges and weight
		 A.adjacencies = new Edge[]{ new Edge(M, 8) };
        B.adjacencies = new Edge[]{ new Edge(D, 11) };
        D.adjacencies = new Edge[]{ new Edge(B, 11) };
        F.adjacencies = new Edge[]{ new Edge(K, 23) };
        K.adjacencies = new Edge[]{ new Edge(O, 40) };
        J.adjacencies = new Edge[]{ new Edge(K, 25) };
        M.adjacencies = new Edge[]{ new Edge(R, 8) };
        O.adjacencies = new Edge[]{ new Edge(K, 40) };
        P.adjacencies = new Edge[]{ new Edge(Z, 18) };
        R.adjacencies = new Edge[]{ new Edge(P, 15) };
        Z.adjacencies = new Edge[]{ new Edge(P, 18) };


		 computePaths(V[0]); // run Dijkstra
        System.out.println((long)V[N-1].minDistance);
        List<Vertex> path = getShortestPathTo(Z);
        System.out.println("Path: " + path);
	}
}

*/