//WAP to create array of size 10 and store 10 values in it and find the duplicated values from array 
import java.util.*;
public class FindDublicateValue{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	Arrays.sort(a);
	
	for(int i=1; i<a.length; i++){
		int count=1;
		if(a[i-1]==a[i]){
			count++;
		}
		
			if(count>1){
				System.out.print(a[i]);
			}
	    
	}

	}
}
	