//Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class CheckVowel{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Input Alphbet:");
	char ch = sc.next().charAt(0);
	
	String str = ch == 'A' ||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'||
				 ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u' ? 
				 "Alphbet is Vowel" :
				 ch >= 'A' && 'Z' >= ch ||  ch >= 'a' && 'z' >= ch  ?
				 "Alphbet is Cosonant" :"Input is not Alphabet"   ;
	System.out.printf(str);
	
	}
}