//Q7. Write a java program to find union array & intersection array of a two array. 
import java.util.*;
public class Q7{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	int a[] = {1,2,3,4,5};
	int b[] = {2,3,4,6,7};

	System.out.print("Intersection of the Array:");
	for(int i=0 ; i<a.length;i++){
		for(int j=0 ; j<b.length;j++){
			if(a[i] ==b[j]){
				System.out.print(a[i]+" ");
				break;
			}
		
		}
	
	}
		System.out.println();
		
	System.out.print("Union of the Array:");
	for(int i=0 ; i<a.length;i++){
		for(int j=0 ; j<b.length;j++){
			if(a[i] ==b[j]){
				b[j] =-1;
			}
		}
		
	
	}
	
	for(int i=0 ; i<b.length; i++){
		
		System.out.print(a[i]+ " ");
		
		if(b[i]!=-1){
			
			System.out.print(b[i]+ " ");
		}
	}
				
	
	}
}