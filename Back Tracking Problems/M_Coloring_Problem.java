package GFG;

import java.util.*;
import java.lang.*;
import java.io.*;
public class M_Coloring_Problem {
     int color[];
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 while(N-->0){
	     int v=sc.nextInt();
	     int m=sc.nextInt();
	     int e=sc.nextInt();
	     int graph[][]=new int[v+1][v+1];
	     for(int i=0;i<e;i++){
	         int a=sc.nextInt();
	         int b=sc.nextInt();
	         graph[a][b]=1;
	         graph[b][a]=1;
	     }
	     M_Coloring_Problem g=new M_Coloring_Problem();
	     g.graphcoloring(graph,m,v+1);
	 }
	 }
	 boolean isSafe(int v,int color[],int graph[][],int c,int V) {
		for(int i=0;i<V;i++) {
			if(graph[v][i]==1 && c==color[i])
				return false;
		}
		return true;
	}
	boolean graphColorUtil(int graph[][],int m,int color[],int v,int V) {
		if(v==V)
			return true;
		for(int c=1;c<=m;c++) {
			if(isSafe(v,color,graph,c,V)) {
				color[v]=c;
				if(graphColorUtil(graph,m,color,v+1,V))
					return true;
				color[v]=0;
			}
		}
		return false;
	}
	void graphcoloring(int graph[][],int m,int V) {
		color=new int[V];
		Arrays.fill(color, 0);
		 if (!graphColorUtil(graph, m, color, 0,V)) { 
		            System.out.println("0"); 
		        }
		        else
		        System.out.println("1"); 
	}
}