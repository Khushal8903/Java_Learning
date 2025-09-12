//Check if Two Strings Are Anagrams (Using Sorting and Two Pointers)
//Check if two strings are anagrams using sorting and comparing via two pointers.

import java.util.*;
public class StringsAreAnagrams{
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
	System.out.printf("Enter the %d value of the Array:",n1);
	for(int i=0 ; i<n1 ; i++){
	   b[i] = sc.nextInt();
	}
	
	Arrays.sort(a);
	Arrays.sort(b);
	boolean f= true;
	for(int i=0 ; i<a.length ; i++){
		if(a[i] != b[i]){
			f = false;
			break;
		}	
	}
	
	String str = f?"Anagrams" : "Not Anagrams";
	System.out.print(str);
	}
}