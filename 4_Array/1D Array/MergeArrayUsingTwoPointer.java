//Example:WAP to create two arrays of size 5 and merge them in third array (Using two pointer)

import java.util.*;
public class MergeArrayUsingTwoPointer{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the size of the First Array:");
	int n= sc.nextInt();
	int a[] = new int[n];
	
	System.out.printf("Enter the %d value of the Array:", n);
	for(int i=0; i<n ; i++){
	 a[i]= sc.nextInt();
	}
	
	System.out.printf("Enter the size of the Second Array:");
	int n1= sc.nextInt();
	int b[] = new int[n1];
	
	System.out.printf("Enter the %d value of the Array:", n1);
	for(int i=0; i<n1 ; i++){
	 b[i]= sc.nextInt();
	}
	int c[] = new int [a.length+b.length];
	int max=0;
	
	if(a.length>b.length){
		for(int i=0;  i<a.length;i++){
		if(i<b.length){
		c[i+a.length]=b[i];
		}
		c[i]=a[i];
		
		}
	}else{
		for(int i=0; i<b.length;i++){
		if(i<a.length){
		c[i]=a[i];
		}
		c[i+a.length]=b[i];
	}
	}
	
	for(int i=0 ; i<c.length;i++){
	System.out.print(c[i]);
	}
	
	
	}
}