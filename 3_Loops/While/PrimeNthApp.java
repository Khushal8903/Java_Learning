//Q30. Write a java program to display 1 to nth Prime Number.
import java.util.*;
public class PrimeNthApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number till number:");
	int num =  sc.nextInt();
	 int j  = 2;
	 
	while(j <= num){
		boolean flag = true;
	    int i =2;
			while(i <j){
				if(j % i == 0){
				   flag = false;
				}
				i++;
	        }
			if(flag){
			System.out.println(j);
			}
	    j++;
	}
}
}