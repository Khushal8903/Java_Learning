/*
Q42. Write a Java program to print all automorphic numbers between 1 and n. An automorphic number’s square ends with the number itself (e.g., 5² = 25).
 Explanation:
 Use loop to check square and a while loop to match last digits.
*/
import java.util.*;
public class AutomorphicApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number 1st number:");
	int num = sc.nextInt();
	 int sq, ld;
	for(int i =1 ; i<= num ; i++){
	    sq = i*i;
		ld = sq%10;
		if(i ==ld){
		  System.out.println(i);
		}
	}
	}}