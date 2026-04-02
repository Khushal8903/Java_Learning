package com.test;
import java.util.*;
public class Q3 {
	
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sq = n*n;
		System.out.println(isNeon(n ,sq));
	}
	static int sum=0;
	public static boolean isNeon(int n, int sq) {
		
		if(sq <= 0) {
			if(sum==n) {
				return true;
			}else {
				return false;
			}
			
		}
		sum +=sq%10;
		return isNeon(n , sq/10);
	}
}
