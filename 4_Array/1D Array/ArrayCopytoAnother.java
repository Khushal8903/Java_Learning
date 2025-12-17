//Q13. Write a java program to copy one array to another array.
import java.util.*;
public class ArrayCopytoAnother{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	int b[] = new int[a.length];
	for(int i=0 ; i<a.length ;i++){
	  b[i] = a[i];
	}
	
	for(int i=0 ; i<b.length ;i++){
	  System.out.print(b[i]);
	}
	}
	}