package GFG;
import java.util.*;
public class Dijkstra_Implement {
	    static int[] dijkstra(ArrayList<ArrayList<Integer>> g, int src, int V)
	    {
	        boolean visited[]=new boolean[V];
	        Arrays.fill(visited,false);
	        int dist[]=new int[V];
	        Arrays.fill(dist,Integer.MAX_VALUE);
	        dist[src]=0;
	        for(int i=0;i<V-1;i++){
	            int minVal=Integer.MAX_VALUE;
	            int min=V;
	            for(int j=0;j<V;j++){
	                if(!visited[j] && dist[j]<minVal){
	                    minVal=dist[j];
	                    min=j;
	                }
	            }
	            if(min==V)
	            break;
	            visited[min]=true;
	            ArrayList<Integer> temp=g.get(min);
	            int count=0;
	            for(Integer x : temp){
	                if(!visited[count] && x!=0 && dist[min]+x<dist[count]){
	                    dist[count]=dist[min]+x;
	                }
	                count++;
	            }
	        }
	        return dist;
	    }
}
