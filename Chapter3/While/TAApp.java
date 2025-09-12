//WAP to input number from keyboard and print its table using addition.
import java.util.*;
public class TAApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int i=1 , sum=0 ;
	while(i<=10){
		
	System.out.printf("%d + %d" , num , sum);
	sum = sum+num ;
	
	System.out.printf("= %d\n",sum);
	i++;
	}
	}
}