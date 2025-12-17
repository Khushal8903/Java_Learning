/*
Q15.Find Intersection of Two Arrays
Class: ArrayIntersection
Functions:
void inputArrays(int arr1[], int arr2[])
void findIntersection()
Logic:
Compare elements of arr1 with arr2.
If common element found, print it (but avoid duplicates).
*/
import java.util.*;
public class ArrayIntersection{
	int a1[];
	int a2[];
	
	public static void main(String x[]){
	
	ArrayIntersection ai = new ArrayIntersection();
	ai.inputArray();
	ai.findIntersection(ai.a1 , ai.a2);
	
	
	
	}
	
	
	void inputArray(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array:");
		int n1= sc.nextInt();
		int []arr1 = new int[n1];
		System.out.print("Enter the value of the Array:");
			for(int i = 0  ;  i<arr1.length ; i++){
				arr1[i] = sc.nextInt();
			}
			a1  = arr1;
			
		System.out.print("Enter the size of the Array:");
		int n2 = sc.nextInt();
		int []arr2 = new int[n2];
		System.out.print("Enter the value of the Array:");
			for(int i = 0  ;  i<arr2.length ; i++){
				arr2[i] = sc.nextInt();
			}
			a2  = arr2;
	}
	
	void findIntersection(int arr1[] , int arr2[]){
		for(int i=0 ; i<arr1.length ; i++){
			for(int j = 0 ; j<arr2.length-1 ; j++){
				if(arr1[i] == arr2[j]){
					System.out.print(arr1[i]+" ");
				}
			}
		}
		
	}
}