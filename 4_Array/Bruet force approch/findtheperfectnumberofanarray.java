//Q20. Write a java program to find the perfect number of an array.
import java.util.*;
public class findtheperfectnumberofanarray{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	int num=0;
	for(int i=0 ; i<a.length ; i++){
		num=a[i];
		int sum = 0;
		for(int j=1 ; j<num ; j++){
			if(num%j == 0){
				sum = sum+j;
			}
		}
		if(sum == num){
			System.out.print(num + " ");
		}
	
	}
	}
		
	}