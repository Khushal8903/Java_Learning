/*
Q14. Find Pair of Elements with Given Sum
Class: ArrayPairSum
Functions:
void inputArray(int arr[])
void findPairs(int target)
Logic: Check all pairs (i, j) where arr[i] + arr[j] == target.
*/
import java.util.*;
public class ArrayPairSum{
	int a[];
	int t ; 
	public static void main(String x[]){
	
	ArrayPairSum ap = new ArrayPairSum();
	ap.inputArray();
	ap.findPairs(ap.t , ap.a);
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
			System.out.print("Enter the Target:");
			int ta = sc.nextInt();
			t = ta;
			a  = arr;
	}
	
	void findPairs(int target , int []arr){
		for(int i = 0 ; i<arr.length ; i++){
			for(int j=0 ; j<arr.length ; j++){
				if(arr[i] + arr[j] == target){
					System.out.print("("+arr[i]+","+arr[j]+") ");
				}
			}
		}
		
	}
}