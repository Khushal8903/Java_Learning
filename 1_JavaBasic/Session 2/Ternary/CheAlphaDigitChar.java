//Q40. Write a java program to input any character and check whether 
//it is alphabet, digit or special character.
import java.util.*;
public class CheAlphaDigitChar{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Charecter: ");
	 char ch = sc.next().charAt(0);
	
	String str = 'A'<ch && 'Z'>ch ? "Alphabet":
				 'a'<ch && 'z'>ch ? "Alphabet":
				 '0'<ch && '9'>ch ? "Digit" : "Special Charecter" ;
				 
	System.out.printf(str);			 
	
	}
}