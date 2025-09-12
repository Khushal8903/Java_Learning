//Q22. Write a java program to find a strong number of an array.
import java.util.*;
public class findastrongnumberofanarray{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	for(int i=0 ; i<a.length ;i++){
	int	num = a[i];
		int sum=0;
		while(num !=0){
			int rem=num%10;
			int f=1;
				while(rem!=0){
					f = f*rem;
					rem--;
				}
		sum = sum + f;
		
		num =num/10;
			
		}
		if(sum == a[i]){
		System.out.print(a[i]+" ");
		}
	}
	
	}
}
	