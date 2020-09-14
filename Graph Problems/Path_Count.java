package GFG;

public class Path_Count {
	 public int pathCount (Graph g, int src, int des){
	        int V = g.v;
	        boolean vis[] = new boolean[V];
	        vis[src] = true;
	        int count = solve(src, g, des, vis, 0);
	        return count;
	        }
	        int solve(int u, Graph g, int des, boolean vis[],int ans){
	            if(u == des){
	            return ans + 1;
	        }
	        for(int v : g.edges[u]){
	            if(!vis[v]){
	            vis[v] = true;
	            ans = solve(v, g, des, vis, ans);
	            vis[v] = false;
	        }
	    }
	return ans;
	}
}
