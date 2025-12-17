/*
Q4. Search an Element in Array
Class: ArraySearch
Functions:
void inputArray(int arr[])
boolean searchElement(int key)
Logic: Traverse array, check if key matches any element.
*/
import java.util.*;
public class ArraySearch{
	
	int a[];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String x[]){
		ArraySearch as = new ArraySearch();
		as.inputArray();
		System.out.print("Enter the key value:");
		int k = sc.nextInt(); 
		if(as.searchElement(k , as.a)){
			System.out.print("Key Found");
		}else{
			System.out.print("Key Not Found");
		}
	}
	
	void inputArray(){
		
		System.out.print("Enter the size of the Array:");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter the value of the Array:");
			for(int i = 0  ;  i<arr.length ; i++){
				arr[i] = sc.nextInt();
			}
			a  = arr;
		}
	
	
	boolean searchElement(int key , int ...a){
		for(int i=0 ; i<a.length ; i++){
			if(a[i] == key){
				return true;
			}
		}
			return false;
	
	
}
}
