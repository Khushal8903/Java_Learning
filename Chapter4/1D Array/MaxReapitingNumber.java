/*
Q10. Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7
*/
import java.util.*;
public class MaxReapitingNumber{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	int count=0,count1=0,num=0;
	for(int i=0 ; i<9 ; i++){
		for(int j=0;j<a.length;j++){
			if(i==a[j]){
				count++;
			}
		}
		if(count>count1){
			count1=count;
			num = a[i];
		}
	}
	
	System.out.print(num);
	
	}
}