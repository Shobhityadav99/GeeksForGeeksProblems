package GFG;

import java.util.*;
import java.lang.*;
import java.io.*;
public class VeryToughProblem {
		public static void main (String[] args)
		 {
		 Scanner sc=new Scanner(System.in);
		 int N=sc.nextInt();
		 while(N-->0){
		     int n=sc.nextInt();
		     int s=sc.nextInt();
		     int x=sc.nextInt();
		     System.out.println(Solve(n,s,x));
		 }
		 }
		 public static String Solve(int n,int s,int x){
		     if(s<x) return "No";
		     if((s%2)!=(x%2)) return "No";
		     if((n==1)&&(s==x)) return "Yes";
		     if((n==1)&&(s!=x)) return "No";
		     if(n>=3) return "Yes";
		     return "No";
		 }
	}