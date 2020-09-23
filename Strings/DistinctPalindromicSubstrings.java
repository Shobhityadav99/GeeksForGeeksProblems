package GFG;

import java.util.*;
import java.lang.*;
import java.io.*;
public class DistinctPalindromicSubstrings {
		public static void main (String[] args)
		 {
		 Scanner sc=new Scanner(System.in);
		 int N=sc.nextInt();
		 while(N-->0){
		     String str=sc.next();
		     System.out.println(countAllPalindromes(str));
		 }
		 }
		 public static int countAllPalindromes(String str){
		     Set<String> set=new HashSet<>();
		     for(int i=0;i<str.length();i++){
		         expand(str,i,i,set);
		         expand(str,i,i+1,set);
		     }
		     return set.size();
		 }
		 public static void expand(String str,int low,int high,Set<String> set){
		     while(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high)){
		         set.add(str.substring(low,high+1));
		         low--;
		         high++;
		     }
		 }
	}