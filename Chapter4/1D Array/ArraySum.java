//Q2. Write a java program to calculate sum of array is size 5.
import java.util.*;
public class ArraySum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the size of Array:");
	int n= sc.nextInt();
	int sum=0;
	int a[] = new int[n];
	System.out.printf("Enter the %d value of Array:",n);

	for(int i=0; i<n; i++){
	  a[i] = sc.nextInt();
	}
	
	for(int i=0; i<a.length; i++){
	   sum = sum + a[i];
	}
	System.out.printf("Sum of the Array: %d", sum);
	
	}
}