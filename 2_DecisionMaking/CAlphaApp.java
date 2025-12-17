//Q6. Write a Java program to check whether a character is alphabetic or not.
import java.util.*;
public class CAlphaApp{
	public static void main(String []x){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the Charecter:");
	char ch = sc.next().charAt(0);
	if( ch >= 65 && ch <= 90 || ch>=97 && ch <=122 ){
	System.out.printf("Charecter is Alphabet");
	}else{
	System.out.printf("Charecter is not Alphabet");
	}
	}
}