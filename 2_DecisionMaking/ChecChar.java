//Q24. Write a java program to check whether a character is uppercase or lowercase alphabet
import java.util.*;
public class ChecChar{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Charecter");
	char ch = sc.next().charAt(0);
	if(ch >= 'A' && ch <= 'Z'){
	System.out.printf("Upper Case");
	}else {
	System.out.printf("Lower Case");
	} 
	
	}
}