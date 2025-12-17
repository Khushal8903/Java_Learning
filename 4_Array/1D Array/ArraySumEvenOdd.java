//Q8. Write a java program to calculate the sum of even or odd numbers.
import java.util.*;
public class ArraySumEvenOdd{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the size of the Array:");
	int n= sc.nextInt();
	int a[] = new int[n];
	
	System.out.printf("Enter the %d value of the Array:", n);
	for(int i=0; i<n ; i++){
	 a[i]= sc.nextInt();
	}
	int sum1=0, sum2=0;
	for(int i=0; i<a.length;i++){
	   if(a[i]%2==0){
	     sum1 = sum1+a[i];
	   }else{
	     sum2 = sum2+a[i];
	   }
	}
	
	System.out.println("Sum of Even number is:" +  sum1);
	System.out.println("Sum of Odd number is:" + sum2);
	
	
	}
}