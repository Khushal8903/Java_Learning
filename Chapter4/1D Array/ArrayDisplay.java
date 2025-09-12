//Q1. Write a java program to take input from array of size 5 and display it.
import java.util.*;
public class ArrayDisplay{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Enter the length of the Array:");
	int n= sc.nextInt();
	
	int a[] = new int[n];
	System.out.printf("Enter the %d Value of Array:",n);
	
	for(int i=0; i<n ; i++){ 
	 a[i] = sc.nextInt();
	}
	
	for(int i=0; i<a.length;i++){
	  System.out.print(a[i]);
	} 
	
	}
}