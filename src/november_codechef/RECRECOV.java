package november_codechef;

import java.io.*;

import java.util.*;

import myutil.Reader;

public class RECRECOV {

	static void dfs(List<Integer>[] graph, boolean[] used, List<Integer> res, int u) {
		used[u] = true;
		for (int v : graph[u])
			if (!used[v])
				dfs(graph, used, res, v);
		res.add(u);
	}

	public static List<Integer> topologicalSort(List<Integer>[] graph) {
		int n = graph.length;
		boolean[] used = new boolean[n];
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < n; i++)
			if (!used[i])
				dfs(graph, used, res, i);
		Collections.reverse(res);
		return res;
	}

	// Usage example
	public static void main(String[] args) throws IOException
	{
		int T;
		int N,M,A,B;
		Reader.init(System.in);
		PrintWriter out = new PrintWriter(System.out);
		T=Reader.nextInt();
		while(T-->0)
		{
			N=Reader.nextInt();
			M=Reader.nextInt();
			
			List<Integer>[] g = new List[N];
			for (int i = 0; i < N; i++)
			{
				g[i] = new ArrayList<>();
			}
			for (int i = 0; i < M; i++)
			{
				A=Reader.nextInt();
				B=Reader.nextInt();
				g[A-1].add(B-1);
			}
			List<Integer> res = topologicalSort(g);
			int []arr=new int[N];
			int i = 0;
			for (Integer x : res) 
			{
				arr[i++]=x;
				
			}
			int count =0;
			for(int j=0;j<N-1;j++)
			{
				if(!g[arr[j]].contains(arr[j+1]))
				{
				   	count++;
				}
			}
			
			out.println(count+1);
		}
		out.flush();
		out.close();
		
		
		
		
	}
}