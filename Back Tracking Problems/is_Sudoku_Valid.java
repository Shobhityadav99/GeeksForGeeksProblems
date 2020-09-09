package GFG;
import java.util.*;
import java.lang.*;
import java.io.*;
public class is_Sudoku_Valid{
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 while(N-->0){
	     int n=9;
	     int board[][]=new int[n][n];
	     for(int i=0;i<n;i++){
	         for(int j=0;j<n;j++){
	             board[i][j]=sc.nextInt();
	         }
	     }
	     is_Sudoku_Valid g=new is_Sudoku_Valid();
	     if(g.SolveSudoku(board,n)){
	         System.out.println("1");
	     }
	     else
	     System.out.println("0");
	     
	 }
	 
	 }
	 boolean SolveSudoku(int board[][],int n){
	     int row=-1;
	     int col=-1;
	     boolean isEmpty=true;
	     for(int i=0;i<n;i++){
	         for(int j=0;j<n;j++){
	             if(board[i][j]==0){
	                 row=i;
	                 col=j;
	                 isEmpty=false;
	                 break;
	             }
	         }
	         if(isEmpty==false)
	         break;
	     }
	     if(isEmpty)
	     return true;
	     
	     for(int num=1;num<=n;num++){
	         if(isSafe(board,row,col,num)){
	             board[row][col]=num;
	             if(SolveSudoku(board,n))
	             return true;
	             else
	             board[row][col]=0;
	         }
	     }
	     return false;
	 }
	 boolean isSafe(int board[][],int row,int col,int num){
	     for(int i=0;i<board.length;i++){
	         if(board[row][i]==num)
	         return false;
	     }
	       for(int i=0;i<board.length;i++){
	         if(board[i][col]==num)
	         return false;
	     }
	     int sqrt=(int)Math.sqrt(board.length);
	     int boxrow=row-row%sqrt;
	     int boxcol=col-col%sqrt;
	     for(int r=boxrow;r<boxrow+sqrt;r++){
	         for(int c=boxcol;c<boxcol+sqrt;c++){
	             if(board[r][c]==num)
	             return false;
	         }
	     }
	     return true;
	 }
}
