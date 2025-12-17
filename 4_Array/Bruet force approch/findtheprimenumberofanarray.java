//Q19. Write a java program to find the prime number of an array.
import java.util.*;
public class findtheprimenumberofanarray{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	int num =0;
	for(int i=0 ; i<a.length ; i++){
		 int j=2;
			num = a[i];
				boolean f = true;
			while(j<num){
				if(num%j == 0){
					f = false;
					break;
				}
				j++;
			}
			
		if(f&&num>1){
		System.out.print(num+" ");
		}
	}
	
	}
}