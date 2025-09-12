/*
Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators.
·        Example: a → A, Z → z.
*/
import java.util.*;
public class CharToggel{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the  Small charecter:");
    char ch = sc.next().charAt(0);
	
	int a = ch -32 ; 
	char ch1 = (char)a;
	System.out.println("The Capital charecter is:" + ch1);
 

	System.out.println("Enter the  Small charecter:");
    char ch2 = sc.next().charAt(0);
	
	int b = ch2 +32 ;
    char ch3 = (char)b 	;
	System.out.println("The Capital charecter is:" + ch3);
	
	}
}