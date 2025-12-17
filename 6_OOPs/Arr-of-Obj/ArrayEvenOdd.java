/*
Q5.Count Even and Odd Numbers
Class: ArrayEvenOdd
Functions:
void inputArray(int arr[])
int countEven()
int countOdd()
Logic: Use % 2 == 0 check.
*/
import java.util.*;
public class ArrayEvenOdd{
	int a[];
	public static void main(String x[]){
	
	ArrayEvenOdd ae = new ArrayEvenOdd();
	ae.inputArray();
	System.out.print("Sum of the Even Number is:" + ae.countEven(ae.a));
	System.out.print("\nSum of the Odd Number is:" + ae.countOdd(ae.a));
	
	
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
	
	int countEven(int ...arr){
	int sum=0 ;
		for(int i=0 ; i<arr.length ; i++){
			if(arr[i] %2 ==0){
				sum = sum +arr[i];
			}
		}
		return sum ;
	}
	
	int countOdd(int ...arr){
	int sum=0 ;
		for(int i=0 ; i<arr.length ; i++){
			if(arr[i] %2 !=0){
				sum = sum +arr[i];
			}
		}
		return sum ;
	}
}