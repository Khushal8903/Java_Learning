//Q34. Write a java program to display 1 to nth Armstrong Number.
import java.util.*;
public class ArmStrongNthApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number till number:");
	int num = sc.nextInt();
	int i = 1  ;
	
	while(i<=num){
	    int j =i;
		int k = j;
		    int count =0;
	    while(j!=0){
			j = j/10;
			count++;
			
		} 
		int sum =0;
		while(k !=0){
			int b = (int)Math.pow(k%10 , count);
			k = k/10;
			sum = sum + b;
		}
		if(sum == i){
		   System.out.println(i);
		}
		i++;
	}}}