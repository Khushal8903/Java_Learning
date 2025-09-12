/*
Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.
*/
import java.util.*;
public class HappyNumApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
         int num = sc.nextInt();
        int sum = 0, n = num ; 
		boolean flag = true;
		while(sum > 10 || flag){
		  flag = false;
		 sum = 0;
		
        while (n != 0) {
		  int a = n%10;
		   sum= sum + a*a;
		  n = n/10;
		  }
		  n = sum;
		  }
		String str = sum ==1 ? "Happy Number" : "Not Happy Number" ;
		System.out.printf(str);
		}}
		  