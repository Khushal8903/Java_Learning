//Q18. Write a java program to find the first and last digit of a number.
import java.util.*;
public class FLApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int n =0;
	int f = num%10;
	
	while(num>0){
		n =num%10;
	 num = num/10;
	 
	}
	System.out.println("First:" + n + '\n'+"Last:"+ f );
}
}	