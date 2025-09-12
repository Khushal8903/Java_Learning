//Q7. Write a java program to display the reverse array.
import java.util.*;
public class ArrayRev{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Enter the length of the Array:");
	int n= sc.nextInt();
	
	int a[] = new int[n];
	System.out.printf("Enter the %d Value of Array:",n);
	
	for(int i=0; i<n ; i++){ 
	 a[i] = sc.nextInt();
	}
	
	for(int i=a.length-1; i>=0;i--){
	  System.out.print(a[i]);
	} 
	
	}
}