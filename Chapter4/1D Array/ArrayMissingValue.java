/*
Q12. Write a java program to find missing value in array.
Input : 1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14
*/
import java.util.*;
public class ArrayMissingValue{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	int min = a[0];
	int max = a[n-1];
	
	for(int i=min ; i<max ; i++){
		boolean f = true;
		for(int j=0 ; j<a.length;j++){
		if(a[j]==i){
		     f = false;
		}
		}
		if(f){
			System.out.printf(i+" ");
		}
	}
}
}