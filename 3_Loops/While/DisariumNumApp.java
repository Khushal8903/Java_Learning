/*
Q45. Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
Explanation:
 Use a loop to count digits. Use another loop to extract each digit and calculate the digit raised to its position power using only loops (no Math.pow()). Check if the sum equals the original number.
*/
import java.util.*;
public class DisariumNumApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	
	int i=1;
	
	while(i<=num){
		
		int temp = i;
		int k = temp;
	    int count =0;
	
			while(temp!=0){
			temp = temp/10;
			count++;
			}
			
			
			int sum =0 ;
			
			while(k!=0){
			 int a = k%10;
			 int b = (int)Math.pow(a,count);
			 k = k/10;
			 --count;
			 
			 sum = sum +b;
			 
			 }
			 
			 if(sum == i){
				 System.out.println(i);
			 }
	i++;
	}
}}
	
	
	
	