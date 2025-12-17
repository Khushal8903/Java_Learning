//Q20. Write a java program to swap first and last digits of a number.
import java.util.*;
public class SwapFLApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num =  sc.nextInt();
	int temp = num ;
	int count =0 , L , F, Mid ,P , num1;
	while(num!=0){
		count++;
	  num = num/10;
	  
	}
	num =temp ;
	L = num%10;
	P = (int)Math.pow(10, --count);
	F = num/P;
	num = num%P;
	num = num/10;
	num1 = L*P + num*10 +F;
	System.out.println(num1);
	
	}
}