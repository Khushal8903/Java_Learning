//WAP to create two array of size 5 and check array is anagram or not 
import java.util.*;
public class AnagramCheck{
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
		boolean f=true;
		for(int i=0 ; i<a.length ;i++){
		
			if(a[i] != b[i]){
				f=false;
			}
		}
		if(f){
			System.out.print("Anagram");
		}else{
			System.out.print("Not Anagram");
			}
	}
}