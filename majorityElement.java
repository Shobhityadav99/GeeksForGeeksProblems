package GFG;

import java.util.Scanner;

public class majorityElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int cand=findCandidate(arr,n);
		if(isMajority(arr,n,cand)) {
			System.out.println(cand);
		}
		else
			System.out.println("No Such Element");
	}
	
	static int findCandidate(int arr[],int n) {
		int maj_index=0;
		int count=1;
		for(int i=1;i<n;i++) {
			if(arr[maj_index]==arr[i])
				count++;
			else
				count--;
			if(count==0) {
				maj_index=i;
				count=1;
			}
		}
		return arr[maj_index];
	}
	
	static boolean isMajority(int arr[],int n,int cand) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(cand==arr[i])
				count++;
		}
		if(count>n/2) {
			return true;
		}
		else
			return false;
	}

}
