//Q18. Write a java program to remove duplicated values of arrays.
import java.util.*;
public class RemoveDublicate{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	
	for(int i=0 ;i<a.length ;i++){
		for(int j=i+1 ; j<a.length ;j++){
		if(a[i]==a[j]){
			a[i] = -1;
		}
		
		}
	}
	for(int i=0 ; i<a.length ;i++){
	
	if(a[i]!=-1){
		System.out.print(a[i]);
	}
	}
	}
}