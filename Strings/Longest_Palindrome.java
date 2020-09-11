package GFG;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Longest_Palindrome {
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
while(t-->0)
{
String s=sc.nextLine();
int n=s.length();
boolean[][] dp=new boolean[n][n];
for(int i=0;i<n;i++)
dp[i][i]=true; 
for(int i=1;i<n;i++) {
    if(s.charAt(i-1)==s.charAt(i))
    dp[i-1][i]=true; 
}
for(int k=2;k<n;k++){
    int i=0;int j=k;
    while(i<n-1&&j<n){
        if((s.charAt(i)==s.charAt(j))&&(dp[i+1][j-1]==true))
        dp[i][j]=true; 
        i++;
        j++;
        }
    
}
String ans="" ;
int flag=0; 
int length=0; 
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++) {
        if(dp[i][j]==true) {
            int temp=j-i; 
            if(temp>length)
{
length=temp;
ans=s.substring(i,j+1);
}
}
}
}
if(length==0)
System.out.println(s.charAt(0));
else
System.out.println(ans);
}
}
}