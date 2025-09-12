//Q6. Write a java program to Check If a Number Is a Spy Number or Not spy number using function recursion
import java.util.*;
public class Q6{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int sum=0 , prod=1;
	System.out.print("Enter the number:");
	int n = sc.nextInt();
	checkSpy(n ,sum ,prod);
	}
	
	
	public static void checkSpy(int n, int s , int p){
			
			if(n==0){
				
				if(s==p){
					System.out.print("Spy");
					return ;
				}else{
					System.out.print("Not Spy");
				return;
				}
				
			}
	
			int rem = n%10;
			s = s+rem;
			
			p = p *rem;
			
			n=n/10;
			checkSpy(n,s,p);
			
			
	}
}