//Q14. Write a java program to check whether a number is palindrome or not.
import java.util.*;
public class PalidromApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int temp = num;
     int n=0;
	while(num >0){
		n = n*10+num%10;
		num = num/10;
		
	}
	if(n == temp){
		System.out.printf("Palidrom");
	}else{
		System.out.printf("Not Palidrom");
		
	}
	



}

}