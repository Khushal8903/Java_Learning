package com.test;
import java.util.*;
public class Q5 {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Array:");
		int n=sc.nextInt();
		System.out.println("Enter the data in Array : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int max=0;
		for(int i=arr.length-1 ;i>=0 ; i--) {
			if(arr[i] > max) {
				max = arr[i];
				System.out.println(arr[i]);
			}
		}
	}
}
