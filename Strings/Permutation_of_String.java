package GFG;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Permutation_of_String {
	    static ArrayList<String> res=new ArrayList<>();
		public static void main (String[] args) {
			//code
		    Scanner scan = new Scanner(System.in);
			int t = Integer.valueOf(scan.nextLine().trim());
			while(t>0){
			    t--;
				String w = scan.nextLine().trim();
				res = new ArrayList<>();
				permute(w,0,w.length()-1);
				Collections.sort(res);
				System.out.println(res.toString().replace("[","").replace("]","").replace(",",""));
			}
		}
		 static void permute(String str,int l,int r){
		     if(l==r)
		     res.add(str);
		     else{
		         for(int i=l;i<=r;i++){
		             str=swap(str,l,i);
		             permute(str,l+1,r);
		             str=swap(str,l,i);
		         }
		     }
		 }
		 static String swap(String str,int i,int j){
		     char temp;
		     char[] charArray=str.toCharArray();
		     temp=charArray[i];
		     charArray[i]=charArray[j];
		     charArray[j]=temp;
		     return String.valueOf(charArray);
		 }
	}