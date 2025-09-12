//Q2. Write a java program to print 1 to nth Strong number.
import java.util.*;
public class Q2{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the nth number:");
	int n = sc.nextInt();
	
	int i=0;
	while(i<=n){
		
		int a=i;
		int sum=0;
		while(a!=0){
			int rem = a%10;
				int f=1;
				while(rem!=0){
					f = f*rem;
					rem--;
				}
			sum =sum+ f;
			a=a/10;
		}
		
		if(sum == i){
			System.out.print(i+" ");
		}
		
		i++;
	}
	}
}