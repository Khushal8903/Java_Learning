//Q35. Write a java program to find the frequency of each digit in a given integer.
import java.util.*;
public class FrequencyApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number :");
	int num = sc.nextInt();
	int i=0;
	while(i <= 9){
		
	     int temp = num , a=0, count=0;
			while(temp != 0){
				a = temp %10;
				if(i==a){
					count++;
				}
				temp = temp/10;
			}
			
			if(count >0){
			System.out.printf("%d frequency is :- %d\n", i , count);
			}
			i++;
			
      }
}}