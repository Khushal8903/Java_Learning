//Q10.Write a java program to check array is palindrome or not.
import java.util.*;
public class ArrayPalidrome{
	public static void main(String x[]){
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter the size of the Array:");
	int n = sc.nextInt();
	int a[]=new int[n];
	
	System.out.printf("Enter the %d value of the Array:" ,n);
	for(int i=0; i<n; i++){
	   a[i] = sc.nextInt();
	}
	
	boolean f = true;
	for(int i=0 ; i<a.length; i++){
	    if(a[i] != a[n-i-1]){
		  f=false;
		  break;
		}
	}
	String str = f ? "Palidrome" : "Not Palidrome";
	System.out.print(str);
	
	}
}