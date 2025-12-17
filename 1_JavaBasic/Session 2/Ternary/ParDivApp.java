/*
Q55. Print Parity and Divisibility by 3.
Print :
"Even & Div by 3"


"Even"


"Div by 3"


"None"
*/
import java.util.*;
public class ParDivApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	
	String str = num %2 ==0 ? "Even" : "Odd" ;
	
	String str1 = num %3 ==0 ? "Divisible by 3" : "Not Divisible by 3";
	
	System.out.println(str1 );
	System.out.println( str );
	}
}