class Solution {
    public int orangesRotting(int[][] a) {
        if(a.length==0){
            return 0;
        }
        return bfs(a,a.length,a[0].length);
        
    }

    
	
	public  int bfs(int[][] a,int n,int m) {
		boolean[][] vis=new boolean[n][m];
		Queue<Pair> q=new LinkedList<>();
        HashMap<Pair,Integer> hm=new HashMap<>();
        
		int fresh=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i][j]==2) {
                    Pair p1=new Pair(i,j);
					q.add(p1);
                    vis[i][j]=true;
                    hm.put(p1,1);
				}
				else if(a[i][j]==1) {
					fresh++;
				}
			}
		}
        
        
        int tf=0;
		int res=0;
		while(!q.isEmpty()) {
            
        	Pair p1=q.poll();
			int i1=p1.x;
			int j1=p1.y;
			int f1=fresh;
            int curr=hm.get(p1);
            
			
			if(i1+1<a.length && vis[i1+1][j1]==false &&a[i1+1][j1]==1)
			{
                Pair t=new Pair(i1+1,j1);
				vis[i1+1][j1]=true;
				q.add(t);
                hm.put(t,curr+1);
				fresh--;
				
			}
			if(j1+1<a[i1].length&& vis[i1][j1+1]==false  &&a[i1][j1+1]==1)
			{
                Pair t=new Pair(i1,j1+1);
				vis[i1][j1+1]=true;
				q.add(t);
                hm.put(t,curr+1);
				fresh--;
			}
			if(i1-1>=0 && vis[i1-1][j1]==false &&a[i1-1][j1]==1)
			{
                Pair t=new Pair(i1-1,j1);
				vis[i1-1][j1]=true;
				q.add(t);
                hm.put(t,curr+1);
				fresh--;
				
			}
			if(j1-1>=0 && vis[i1][j1-1]==false &&a[i1][j1-1]==1)
			{
                Pair t=new Pair(i1,j1-1);
				vis[i1][j1-1]=true;
				q.add(t);
                hm.put(t,curr+1);
				fresh--;
			}

			
			if(tf<curr && f1>fresh){
                tf=curr;
                res++;
            }
            
		}
		if(fresh>0) {
			return -1;
		}

		return res;
		
	}
	


}
class Pair{
	int x,y;
	Pair(int x,int y){
		this.x=x;
		this.y=y;
	}
    
    public String toString(){
        return this.x+" - "+this.y;
    }
    
    
    
}