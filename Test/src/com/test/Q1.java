// Write a java program to print 1 to nth Strong number.
package com.test;

import java.util.*;


public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    System.out.println("Strong numbers are:");
	    for (int i = 1; i <= n; i++) {
	      if (isStrong(i)) {
	        System.out.println(i);
	      }
	    }
	  }
	  public static boolean isStrong(int num) {
	    int temp = num;
	    int sum = 0;

	    while (num > 0) {
	      int digit = num % 10;
	      sum += factorial(digit);
	      num/=10;
	    }

	    return sum == temp;
	  }
	  
	  private static int factorial(int digit) {
		int fact=1;
			while(digit!=0) {
				
				fact *= digit;
				digit--;
			}
		return fact;
	  }
}
