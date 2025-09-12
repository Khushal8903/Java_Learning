/*
Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3
*/
import java.util.*;
public class CountDistictPair{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	int pair=0;
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a.length ; j++){
			
			if(a[i] - a[j] ==5){
				pair++;
			}
		}
		
	}
	System.out.print(pair);
	}
}