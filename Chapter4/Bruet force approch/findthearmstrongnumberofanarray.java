//Q23. Write a java program to find the armstrong number of an array.
import java.util.*;
public class findthearmstrongnumberofanarray{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}

	for(int i=0 ; i<a.length ; i++){
			int num = a[i], count=0,temp=a[i],sum=0;;
			while(num!=0){
				int rem = num%10;
				num = num/10;
				count++;
			}
			
			while(temp!=0){
				int rem = temp%10;
				int pow = (int)Math.pow(rem , count);
				sum = sum +pow;
				temp = temp/10;
			}
			
			if(sum == a[i]){
				System.out.print(a[i]+ " ");
			}
	}
	}
}