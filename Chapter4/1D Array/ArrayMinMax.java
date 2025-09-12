//Q3. Write a java program to find maximum and minimum number in array.
import java.util.*;
public class ArrayMinMax{
	public static void main(String x[]){
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter the size of the Array:");
	int n = sc.nextInt();
	int a[]=new int[n];
	
	System.out.printf("Enter the %d value of the Array:" ,n);
	for(int i=0; i<n; i++){
	   a[i] = sc.nextInt();
	}
	
	int max =0;
	int min = a[0];
	
	for(int i=0; i<a.length;i++){
	  
	  if(a[i]>max){
		max = a[i];
	  }else if(a[i]<min){
		min = a[i];
	  }
	}
	System.out.printf("Max: %d and the Min: %d", max , min);
	
	
	}
}