//Q5. Write a Java program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;
public class CDApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	
	if(num%5 == 0 && num%11==0){
	System.out.printf("NUmber is Divisible by 5 and 11"); 
	}else{
	System.out.printf("NUmber is not Divisible by 5 and 11"); 
	}
	}
}