package GFG;

import java.util.Scanner;

public class easyString {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 while(N-->0){
	     String str=sc.next();
	     str=str.toLowerCase();
	     int count = 1;
	     String s="";
	     char prev = str.charAt(0);
	     int n=str.length();
	     for(int i=1;i<n;i++){
	         if(prev==str.charAt(i)){
	             count++;
	         }else{
	                 s=s+count+prev;
	                 count=1;
	         }
	         prev=str.charAt(i);
	     }
	    s=s+count+prev;
	    System.out.println(s);
	 }
	 }
}
