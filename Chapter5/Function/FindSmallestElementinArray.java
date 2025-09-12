/*
Find Smallest Element in an Array


Write a function findMin(int arr[]) that returns the smallest element in the array.


Call it from main().
*/
import java.util.*;
public class FindSmallestElementinArray{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Size of the Array:");
	int size = sc.nextInt();
	int a[] = new int[size];
	
	
	System.out.print("Enter the Value in Array:");
	for(int i=0 ; i<a.length ; i++){
		a[i] = sc.nextInt();
	}
	
	int res = findMin(a);
	System.out.print("Min is:"+res);
	
	}
		public static int findMin(int a[]){
			int min = a[0];
			for(int i=0 ; i<a.length ; i++){
				if(min>a[i]){
					min = a[i];
				}
			}
			return min;
			
		}
	
	}