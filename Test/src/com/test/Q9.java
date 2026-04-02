package com.test;
import java.util.*;

public class Q9 {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<>();
		System.out.println("Enter the number of marks:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			ar.add(sc.nextInt());
			
		}
		System.out.println("Enter the value to find frequency:");
		int target = sc.nextInt();
		int cnt=0;
		for(int i:ar) {
			if(i==target) {
				cnt++;
			}
		}
		
		if(cnt>0) {
			System.out.println("Frequency of the " + target+" is : "+ cnt);
		}else {
			System.out.println("Not Found ");
		}
	
		
	}
}
