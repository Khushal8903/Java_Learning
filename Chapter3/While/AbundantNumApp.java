/*
Q46. Write a Java program to find all Abundant numbers up to n.
 An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
 Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 → sum = 16 > 12.
Explanation:
 Use nested loops: outer for numbers from 1 to n; inner for finding proper divisors and summing them. Compare sum with the number.
*/
import java.util.*;
public class AbundantNumApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int i =1;
	while(i<=num){
int sum = 0;
			for(int j = 1; j <=i/2; j++){
			
			
			if(i%j ==0){
			   sum = sum + j ;
			}}
			
			if(sum > i){
			System.out.println(i);
			}
			  
	i++;
			}
		
	}}