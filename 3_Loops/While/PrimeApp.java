/*
Q21.  Write a java program to check Number Is Prime Number or Not.
Example : A prime number is a number that can only be divided by itself and 1 without remainders.
The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
 59, 61, 67, 71, 73, 79, 83, 89, 97.
*/
import java.util.*;
public class PrimeApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num =  sc.nextInt();
	int i =2;
	while(i <(num)){
		if(num % i != 0){
		    System.out.printf("Prime no"); 
			break;
		}
		else{
			System.out.printf("Not Prime no"); 
			break;
			
		}
		i++;
	}
	
	}
}