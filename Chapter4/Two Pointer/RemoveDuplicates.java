//Remove Duplicates from Sorted Array
//Remove duplicates from a sorted array using two pointers and return new length.
import java.util.*;
public class RemoveDuplicates{
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
	
	int num=0;
	int i=0;
	for(int j=1; j<a.length;j++){
		if(a[i] != a[j]){
			i++;
			a[i]=a[j];
	    	num++;
		}
	}
	System.out.println("Length of the Array:"+(num+1));	
	for(int k=0; k<num+1;k++){
		
		
		System.out.print(a[k]);	
		}
	}
}