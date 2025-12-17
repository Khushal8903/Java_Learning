//Q9. Write a java program to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class CVowelApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the Charecter:");
	char ch = sc.next().charAt(0);
	
	if(ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ||ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
	System.out.printf("Charecter is Vowel");
	}else{
	System.out.printf("Charecter is Consonant");
	}
	
	}
}