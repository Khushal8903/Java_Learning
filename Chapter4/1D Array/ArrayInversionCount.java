/*
Q8. Write a program in java to count the number of inversion in a given array
Expected Output :
 The given array is : 1 9 6 4 5
 The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
 The number of inversion can be formed from the array is: 5
*/
import java.util.*;
public class ArrayInversionCount{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	int inv =0;
	for(int i=0 ; i<a.length ; i++){
		for(int j=i+1 ; j<a.length; j++){
			if(a[i]>a[j]){
				inv++;
			}
		} 
	}
	System.out.print(inv);
	
}}