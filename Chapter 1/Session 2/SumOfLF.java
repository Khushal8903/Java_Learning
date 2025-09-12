// Write a program to calculate sum of first and last digit of a number without using loop.
//Input : 123
//Output : 4

import java.util.*;
public class SumOfLF{
	public static void main(String x[]){
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num= sc.nextInt();
	
	int first = num/100;
	int last = num%10;
	
	sum = first+last;
	
	System.out.println(sum);
	
	}
}
