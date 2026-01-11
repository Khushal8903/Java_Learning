/*
Q24. Write a java program to convert first character of each word to uppercase.
 Input : java is easy
 Output : Java Is Easy
*/
import java.util.*;
public class Q24{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	StringBuilder s = new StringBuilder(sc.nextLine());
	
	
	for(int i=0;i<s.length();i++){
		if(i==0 || s.charAt(i) == ' '){
			if(i==0){
				
				s.setCharAt(i , (char)(s.charAt(i) - 32));
			}else{
			
				s.setCharAt(i+1 , (char)(s.charAt(i+1) - 32));
			}
		}
	}
	System.out.println(s);
	}
}