//Q33. Write a java program to display 1 to nth Strong Number.
import java.util.*;
public class StrongNthApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number till number:");
	int num = sc.nextInt();
	int i = 1 , sum ;
	
	while(i<=num){
	      int j =i;
		  int f;
		 sum=0;3
		while(j !=0){  
		   int a=j%10;
		   f=1;
		  while(a !=0){
				f = f *a;
				a--;
			}
			sum = sum + f;
		    j = j/10;
			
	    } 
		 if(sum == i ){
		 System.out.println(i);
		 } 
	 i++;
    }
}}