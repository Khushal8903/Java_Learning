//Reverse an Array In-Place
//Reverse an array using the two-pointer technique.
import java.util.*;
public class ReverseArray{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	int s=0 , e = a.length-1;
	
	while(s<=e){
	
		int temp = a[s];
		a[s] = a[e];
		a[e]  = temp;
		s++;
		e--;
	}
	for(int i=0 ; i<a.length ; i++){
		System.out.print(a[i]);
	
	}
	}
}