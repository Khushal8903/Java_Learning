//Write a function to check if a number is a perfect number.
import java.util.*;

public class checkPerfectNum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	isPerNum(num);
	
	}
	
	public static void isPerNum(int a){
		int sum = 0;
		for(int i=1 ; i<a ; i++){
			if(a%i==0){
				sum = sum+i;
			}
		}
		if(sum == a){
			System.out.print("Perfect Number");
		}else{
			System.out.print("Not Perfect Number");
		}
		
		
	}
}