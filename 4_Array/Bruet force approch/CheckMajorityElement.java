//Q17.  Write a java program to check the majority element of an array.
import java.util.*;
public class CheckMajorityElement{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	int result=0, max=0;
	
	for(int i=0 ; i<a.length ; i++){
		int count=0;
		for(int j=i ; j<a.length; j++){
			if(a[i]==a[j]){
				count++;
			}
			
		}
		if(max<count){
			max =count;
			result = a[i];
		}
	}
	System.out.print(result);
	}
}