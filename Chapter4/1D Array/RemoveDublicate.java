//Q18. Write a java program to remove duplicates values of array.

import java.util.*;
public class RemoveDublicate{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Size of Array:");
	int n = sc.nextInt();
	int a[] = new int[n];
	int count=0;
	System.out.printf("Enter the %d value of the Array:", n);
	for(int i=0; i<n; i++){
	  a[i] = sc.nextInt();
	}
	
	
	for(int i=0; i<a.length-1;i++){
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j]&&a[j]!=-1)
			{
				a[j]=-1;
			}
		}
	
	}
	
	for(int i=0; i<a.length; i++){
	  
			if(a[i]!=-1)
			{
			System.out.print(a[i]);	
			}
	}
	
	
	
	}
}