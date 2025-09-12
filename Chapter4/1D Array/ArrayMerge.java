//Q9. Write java program to merge two array and display it.
import java.util.*;
public class ArrayMerge{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Enter the size of the First Array:");
	int n= sc.nextInt();
	int a[] = new int[n];
	
	System.out.printf("Enter the %d value of the Array:", n);
	for(int i=0; i<n ; i++){
	 a[i]= sc.nextInt();
	}
	
	System.out.printf("Enter the size of the Second Array:");
	int n1= sc.nextInt();
	int b[] = new int[n];
	
	System.out.printf("Enter the %d value of the Array:", n1);
	for(int i=0; i<n1 ; i++){
	 b[i]= sc.nextInt();
	}
	
	int n2 = (a.length)+(b.length);
	
	int c[] = new  int[n2];
	
	
	for(int i=0; i<a.length;i++){
	   c[i] =a[i];
	}
	
	for(int i=0; i<b.length;i++){
	   c[i+a.length] =b[i];
	}
	
	for(int i=0; i<c.length;i++){
	   System.out.print(c[i]);
	}
	
	
	}
}