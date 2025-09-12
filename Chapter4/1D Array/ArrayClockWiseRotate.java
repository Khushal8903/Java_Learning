// WAP to create array of size 5 and rotate by in clock wise direction using specified size

import java.util.*;
public class ArrayClockWiseRotate{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	System.out.printf("Enter the How many number want to rotate:");
	int k = sc.nextInt();
	/*
				while(k!=0){
						int temp = a[a.length-1];
					for(int i=a.length-2 ; i>=0 ; i--){
						a[i+1]= a[i];
						
					}
					a[0]=temp;
					--k;
				}
	*/
	int start = 0 , end = a.length-1, temp;
	while(start <=end){
		temp = a[start];
		a[start] = a[end];
		a[end]=temp;
		start++;
		end--;
	}
	
	end=k-1;
	
	while(start<=end){
		temp = a[start];
		a[start]=a[end];
		a[end]=temp;
		start++;
		end--;
	}
	
	start=k;
	end=a.length-1;
	while(start<=end){
		temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		start++;
		end--;
	}

	for(int i=0 ; i<a.length;i++){
		System.out.print(a[i]);
	}
	}
	}