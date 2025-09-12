//Write a java program to check whether number is neon or not.
//Input : 9
//Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.

import java.util.*;
public class NeonNum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number to check neon or not:");
	int num = sc.nextInt();
	
	int Sq = num*num;
	
	int num1 = Sq/10;
	int num2 = Sq%10;
	System.out.printf("%d %d " ,num1 , num2); 
	int sum = num1+num2;
	
	String str = num == sum ? "Number is Neon" : "Number is not neon";
	System.out.println(str);
	
	}
}