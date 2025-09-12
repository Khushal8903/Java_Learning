//Find Intersection of Two Sorted Arrays
//Return the intersection of two sorted arrays using two pointers.
import java.util.*;
public class IntersectionofTwoSortedArrays{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	System.out.print("Enter the size of the Array:");
	int n1 =sc.nextInt();
	int b[] = new int[n1];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n1 ; i++){
	   b[i] = sc.nextInt();
	}
	Arrays.sort(a);
	Arrays.sort(b);
	
	int i=0, j=0;
	while(i<a.length && j<b.length){
			
			if(a[i]==b[j]){
				System.out.print(a[i] + " ");
				j++;
				
				
			}else if(a[i] < b[j]){
				i++;
			}else {
				j++;
			}
			
		
	}
	}
}