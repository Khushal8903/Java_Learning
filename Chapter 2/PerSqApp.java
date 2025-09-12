//Q20. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square.
import java.util.*;
public class PerSqApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	double num1 = Math.sqrt(num);
	double num2 =Math.floor(num1);
	if( num1 == num2){
		System.out.printf("Perfect Square of : %.2f" , num1);
	}else{
	System.out.printf("Not Perfect Square");
	}
	}
}