//Q21. Write a java program to find the duck number of an array.
import java.util.*;
public class findtheducknumberofanarray{
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
	num = a[i];
		boolean f = false;
		while(num!=0){
			int rem = num%10;
			if(rem==0){
				f=true;
			}
			num = num/10;
		}
		if(f){
			System.out.print(a[i]+" ");
		}
	}
	}
}