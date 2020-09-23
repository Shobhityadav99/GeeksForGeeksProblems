package GFG;

import java.util.*;
import java.lang.*;
import java.io.*;
public class ReturnTwoPrimeNumbers {
		public static void main (String[] args)
		 {
		 Scanner sc=new Scanner(System.in);
		 int N=sc.nextInt();
		 while(N-->0){
		     int t=0;
		     int n=sc.nextInt();
		     int arr[]=new int[n];
		     for(int i=3;i<n;i++){
		         int k=0;
		         for(int j=2;j<i;j++){
		             if(i%j==0){
		                 k++;
		             }
		         }
		         if(k==0){
		             arr[t]=i;
		             t++;
		         }
		     }
		     int len=t;
		     int k=1;
		     int i=0;
		     while(true){
		         if(arr[i]+arr[len-k]==n){
		             System.out.println(arr[i]+" "+arr[len-k]);
		             break;
		         }
		         if(arr[i]+arr[len-k]>n){
		             k++;
		         }
		         if(arr[i]+arr[len-k]<n){
		             i++;
		         }
		     }
		 }
		 }
	}