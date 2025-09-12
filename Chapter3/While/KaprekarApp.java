/*
Q44. Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45
*/
import java.util.*;
public class KaprekarApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int sq = num*num;
    int temp =sq;
	int count=0;
	
	while(sq!=0){
	
	sq = sq/10;
	count++;
	
	}
	
	int split = count/2;
	int t =(int)Math.pow(10,split);
	
	int a =temp%t;
	int b = temp/t;
	
	int sum = a+b;
	
	System.out.println(sum);
	if(sum == num){
	 System.out.printf("Kaprekar number");
	}else{
	System.out.printf("Not a Kaprekar number");
	}
	}}
	
	
	
	
	