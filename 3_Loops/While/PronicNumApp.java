/*
Q47. Write a Java program to print all Pronic numbers between 1 and n.
 A Pronic number is the product of two consecutive integers, i.e., n(n+1).
 Example: 2 (1×2), 6 (2×3), 12 (3×4) etc.
Explanation:
 Use a loop to check for each number from 1 to n. For each, use another loop to find if it can be expressed as x*(x+1).
*/
import java.util.*;
public class PronicNumApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	
	for(int i = 1 ; i<=num ; i++){
	
	int result = i*(i+1);
	System.out.println(result);
	
	} 
	
}}