/*
Q48. Write a Java program to display all Twin Primes between 1 and n.
 Twin Primes are pairs of prime numbers that differ by 2.
 Example: (3, 5), (5, 7), (11, 13).
Explanation:
 Use loops:
First, loop through numbers from 2 to n.
For each, check if it and the next number +2 are both prime using an inner loop.
If both are prime, print the pair.
*/

import java.util.*;
public class TwinPrimeApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	
	for(int i = 1 ; i<=num ; i++){
		
	    boolean flag = true;
		
		for(int j =2; j<=i/2 ; j++){
			if(i%j == 0){
				flag = false;	
			}
		}
		
		if(flag){
			
			int n = i+2;
			    flag = true;
			  for(int k = 2; k<=n/2 ; k++){
				  if(n%k == 0){
				flag = false;	
			}
				  
				  
			  }
			if(flag)
		System.out.println("(" + i + ", " + n + ")");
		}
	}
	}}