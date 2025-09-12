//Q32. Write a java program to display 1 to nth Duck Number.
import java.util.*;
public class DuckNthApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number till number:");
	int num = sc.nextInt();
	int i = 1;
	while(i<=num){
		boolean b = false;
		int t =i;
		    while(t !=0){
			  int n1 =t%10;
			    if(n1 == 0){
			    	 b = true;
			   }
			   t = t/10;
			}
			  if(b){
				  System.out.println(i);
			  } 
	   i++;
	}
}}