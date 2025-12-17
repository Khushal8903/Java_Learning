/*
Q11. Find Second Largest Element
Class: ArraySecondLargest
Functions:
void inputArray(int arr[])
int findSecondLargest()
Logic: First find max, then find element just smaller than max.
*/
import java.util.*;
public class ArraySecondLargest{
	int a[];
	public static void main(String x[]){
	
	ArraySecondLargest asl = new ArraySecondLargest();
	
	asl.inputArray();

	System.out.print("Second Large Numer of the Array: "+ asl.findSecondLargest(asl.a));
	
	}
	
	
	void inputArray(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array:");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter the value of the Array:");
			for(int i = 0  ;  i<arr.length ; i++){
				arr[i] = sc.nextInt();
			}
			a  = arr;
		}
	
	int findSecondLargest(int ...arr){
		int max = arr[0];
		for(int i=0 ; i<arr.length ;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		int Smax = a[0];
		for(int i=0 ; i<arr.length ;i++){
			if(arr[i] < max  && a[i]>Smax ){
				Smax = arr[i];
			}
		}
		
		return Smax;
		
	}
}