/*
Q21. Write a java program to check whether a number is neon or not.      	
        	Input : 9
        	Output : Neon Number
        	Explanation: square is 9*9 = 81 and
        	The sum of the digits of the square is 9.             
*/

import java.util.*;
public class NeonApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int num1 = num*num;
	int last = num1/10;
	int first = num1%10;
	int sum = last+first;
	
	if(sum == num){
	System.out.printf("Number is Neon");
	}else{
	System.out.printf("Number is not Neon");
	}
	
	
	
	}
}