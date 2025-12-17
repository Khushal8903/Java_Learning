//Write a function to check if a number is a strong number (sum of factorial of digits = number).

import java.util.*;

public class checkStrongNum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	int res = isStrongNum(num);
	if(res == num){
		System.out.print("Strong Number");
	}else{
		System.out.print("Not Strong Number");
	}
	}
	
	public static int isStrongNum(int a){
		int sum =0 ;
		
	while(a!=0){
		int n = a%10,f=1;
		while(n!=0){
			f = f*n;
			n--;
		}
		sum=sum+f;
		a=a/10;
	}
			return sum;
	}
}
