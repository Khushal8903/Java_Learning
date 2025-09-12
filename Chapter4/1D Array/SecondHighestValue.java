/*
Q16. Write a java program to find second highest value of array.
Input : 10 30 50 20 40
Output : 40
*/
import java.util.*;
public class SecondHighestValue{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	int max=0,smax=0;
	for(int i=0 ; i<a.length ;i++){
		if(a[i]>max){
		    max = a[i];
		}else if(a[i]>smax && a[i]<max){
		    smax = a[i];
		}
	
	}
	System.out.println("Second Max:"+smax);
	System.out.println("Max:"+max);
	}
	}
	
	