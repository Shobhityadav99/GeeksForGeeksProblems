package GFG;

public class CheckBridgeEdge {
	class Solution {
	    
	    public void DFS(Graph g,int v,boolean vis[])
	    {
	        vis[v]=true;
	        for(int i=0;i<g.edges[v].size();i++)
	        {
	            int u=g.edges[v].get(i);
	            if(!vis[u])
	                DFS(g,u,vis);
	        }
	    }
	    
	    public boolean isConnected(Graph g,int one,int two)
	    {
	        boolean vis[]=new boolean[g.v];
	        DFS(g,one,vis);
	        if(vis[two]==false)
	            return false;
	        return true;
	    }

	    public boolean isBridge(Graph g, int u, int v) {

	        if(isConnected(g,u,v)==false)
	        {
	            return false;
	        }
	            
	        g.edges[u].remove(new Integer(v));
	        g.edges[v].remove(new Integer(u));
	        
	        if(isConnected(g,u,v)==false)
	        return true;
	        else
	        return false;
	        
	    }
}
