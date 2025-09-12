//Q31. Write a java program to display 1 to nth Perfect Number.
import java.util.*;
public class PerfectNthApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number till number:");
	int num = sc.nextInt();
	int i = 1;
	while(i<=num){
		int j = 1, sum =0;
		while(j<i){
			if(i%j == 0){
				sum = sum + j;
				
			}
		    j++;
		}
		if(sum == i){
		System.out.println(i);
		}
		i++;
	}
	
	}

}