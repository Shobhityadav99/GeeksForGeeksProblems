package GFG;

import java.util.Scanner;

public class kadaneAlgorithm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Kadane(arr,n));
	}
	
	static int Kadane(int arr[], int n) {
		int max_ending=0;
		int max_so_far=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max_ending+=arr[i];
			if(max_ending<0) {
				max_ending=0;
			}
			else if(max_so_far<max_ending) {
				max_so_far=max_ending;
			}
		}
		return max_so_far;
	}

}
