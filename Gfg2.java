// package gfg;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GFG {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while(t-->0)
		{
			String[] s=br.readLine().split(" ");
			int n=Integer.parseInt(s[0].trim());
			int m=Integer.parseInt(s[1].trim());
			String[][] a=new String[n][m];
			for(int i=0;i<n;i++)
			{
				String[] s1=br.readLine().split(" ");
				for(int j=0;j<m;j++)
				{
					a[i][j]=s1[j].trim();
				}
			}
			
			boolean[][] vis=new boolean[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(a[i][j].equals("B"))
					{
						bfs(a,i,j,n,m);
					}
				}
			}
			
			for(int i=0;i<n;i++)
			{

				for(int j=0;j<m;j++)
				{
					if(a[i][j].equals("W") || a[i][j].equals("O"))
					{
						a[i][j]="-1";
					}				
				}	
			}
			
			for(int i=0;i<n;i++) {
				StringBuffer sb=new StringBuffer();
				for(int j=0;j<m;j++)
				{
					if(j!=m-1)
					{
						sb.append(a[i][j]+" ");
					}
					else {
						sb.append(a[i][j]);
					}	
				}
				System.out.println(sb.toString());
			}
			
			
			
			
			
		}
	}
	
	
	public static void bfs(String[][] a,int i,int j,int n,int m)
	{
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(i,j));
		a[i][j]="0";
		
		while(!q.isEmpty())
		{
			Pair p1=q.poll();
			int i1=p1.x;
			int j1=p1.y;
			int v=1+Integer.parseInt(a[i1][j1]);
			
			if(j1+1<m && a[i1][j1+1].equals("O"))
			{
				a[i1][j1+1]=String.valueOf(v);
				q.add(new Pair(i1,j1+1));
			}
			
			if(j1+1<m && !a[i1][j1+1].equals("B") && !a[i1][j1+1].equals("W"))
			{
				int v1=Integer.parseInt(a[i1][j1+1]);
				if(v1>v)
				{
					a[i1][j1+1]=String.valueOf(v);
					q.add(new Pair(i1,j1+1));
				}
			}
			
			if(i1+1<n && a[i1+1][j1].equals("O"))
			{
				a[i1+1][j1]=String.valueOf(v);
				q.add(new Pair(i1+1,j1));
			}
			
			if(i1+1<n && !a[i1+1][j1].equals("B") && !a[i1+1][j1].equals("W")) 
			{
				int v1=Integer.parseInt(a[i1+1][j1]);
				if(v1>v)
				{
					a[i1+1][j1]=String.valueOf(v);
					q.add(new Pair(i1+1,j1));
				}
			}
			
			
			
			if(i1-1>=0 && a[i1-1][j1].equals("O"))
			{
				a[i1-1][j1]=String.valueOf(v);
				q.add(new Pair(i1-1,j1));
			}
			
			if(i1-1>=0 && !a[i1-1][j1].equals("B") && !a[i1-1][j1].equals("W"))
			{
				int v1=Integer.parseInt(a[i1-1][j1]);
				if(v1>v)
				{
					a[i1-1][j1]=String.valueOf(v);
					q.add(new Pair(i1-1,j1));
				}
			}
			
			if(j1-1>=0 && a[i1][j1-1].equals("O"))
			{
				a[i1][j1-1]=String.valueOf(v);
				q.add(new Pair(i1,j1-1));
			}
			
			if(j1-1>=0 && !a[i1][j1-1].equals("B") && !a[i1][j1-1].equals("W"))
			{
				int v1=Integer.parseInt(a[i1][j1-1]);
				if(v1>v)
				{
					a[i1][j1-1]=String.valueOf(v);
					q.add(new Pair(i1,j1-1));
				}
			}
			
		}
	}
	
	

}


class Pair{
	int x,y;
	Pair(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public String toString()
	{
		return this.x+"-"+this.y;
	}
}