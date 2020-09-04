package GFG;
import java.util.*;
import java.lang.*;
import java.io.*;
public class N_Queen_Problem
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 while(N-->0){
	     int n=sc.nextInt();
	     N_Queen_Problem G=new N_Queen_Problem();
	     G.solveNQ(n);
	     System.out.println();
	 }
	 }
	static void print(int board[][],int N){
	     System.out.print("[");
	     for(int i=0;i<N;i++){
	         for(int j=0;j<N;j++){
	             if(board[j][i]==1)
	             System.out.print(j+1+" ");
	         }
	     }
	     System.out.print("] ");
	 }
	static  boolean SolveUtil(int board[][],int col,int N){
	     if(col==N){
	         print(board,N);
	         return true;
	     }
	     boolean res=false;
	     for(int i=0;i<N;i++){
	     if(isSafe(board,i,col,N)){
	         board[i][col]=1;
	         res=SolveUtil(board,col+1,N) || res;
	         board[i][col]=0;
	     }
	 }
	 return res;
	 }
	 static boolean isSafe(int board[][], int row, int col,int N) 
	 { 
	int i, j; 
	for (i = 0; i < col; i++) 
		if (board[row][i] == 1) 
			return false; 
	for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
		if (board[i][j] == 1) 
			return false; 
	for (i = row, j = col; j >= 0 && i < N; i++, j--) 
		if (board[i][j] == 1) 
			return false; 

	return true; 
}
static void solveNQ(int N) 
{ 
	int board[][] = new int[N][N]; 
	if (SolveUtil(board, 0,N) == false) 
	{ 
		System.out.printf("-1"); 
		return ; 
	} 

	return ; 
} 
}