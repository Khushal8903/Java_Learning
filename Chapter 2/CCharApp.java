//Q10. Write a java program to input any character and check whether it is alphabet, digit or special character.
import java.util.*;
public class CCharApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the Charecter:");
	char ch = sc.next().charAt(0);
	
	if(ch >= 'A' || ch <= 'Z' ||ch >= 'a' ||ch <= 'z' ){
	System.out.printf("Input is Charecter ");
	}else if(ch >= '0' || ch <= '9')  {
	System.out.printf("Input is Digit");
	}else{
	System.out.printf("Input is Special Charecter ");
	}
	
	}
}