/*
Q10. Count Frequency of Each Element
Class: ArrayFrequency
Functions:
void inputArray(int arr[])
void countFrequency()
Logic: For each element, count how many times it appears using nested loop.
*/
import java.util.*;
public class ArrayFrequency{
	int a[];
	public static void main(String x[]){
	
	ArrayFrequency af = new ArrayFrequency();
	af.inputArray();
	af.countFrequency(af.a);
	
	
	
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
	
	void countFrequency(int []arr){
		for(int i=0 ; i<=9 ; i++){
			int count = 0;
			for(int j=0 ; j<arr.length ; j++){
				if(i == arr[j]){
					count++;
				}
			
			}
			if(count>0){
				System.out.println(i +"=" + count );
			}
		}
		
	}
}