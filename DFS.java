import java.util.*;

class DFS
{
	
	public static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
	{
		visited[s] = true;
		System.out.print(s+" ");
		for(int u:adj.get(s))
		{
			if(visited[u] == false)
			{
				DFSRec(adj,u,visited);
			}
		}
	
	}
	
	
	public static void DFS(ArrayList<ArrayList<Integer>> adj, int V)
	{
		boolean visited[] = new boolean[V];
		for(int i=0;i<V;i++)
		{
			if(visited[i]==false)
			{
				DFSRec(adj,i,visited);
			}
		}
	}
		
	
	public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static void printGraph(ArrayList<ArrayList<Integer>> adj)
	{
		for(int i=0;i<adj.size();i++)
		{
			for(int j=0;j<adj.get(i).size();j++)
			{
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		int v = 6;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,3);
		addEdge(adj,1,4);
		addEdge(adj,2,3);
		addEdge(adj,4,5);
		
		DFS(adj,v);
		
		System.out.println();
		
		printGraph(adj);
	}
}

		
		
		