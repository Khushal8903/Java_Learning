//Q4. Write a java program to find even and odd number in array.
import java.util.*;
public class ArrayEvenOddNum{
	public static void main(String x[]){
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter the size of the Array:");
	int n = sc.nextInt();
	int a[]=new int[n];
	
	System.out.printf("Enter the %d value of the Array:" ,n);
	for(int i=0; i<n; i++){
	   a[i] = sc.nextInt();
	}
	
	
	System.out.printf("Even Number is: ");
	for(int i=0 ; i<a.length ;i++){
	
	  if(a[i]%2==0){
	     System.out.print(a[i]);
	  }
	}
	System.out.printf("Odd Number is: ");
	for(int i=0 ; i<a.length ;i++){
	
	  if(a[i]%2!=0){
	     System.out.print(a[i]);
	  }
	}
}}