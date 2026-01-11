/*
Q23. Split the string into words and find the word with maximum length.
 Input : Java is very powerful
 Output : powerful
*/
import java.util.*;
public class Q23{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	String s = sc.nextLine();

	int start=-1;
	String s1="";
	String s2="";
	for(int i=0;i<s.length();i++){
		if(s.charAt(i) == ' ' || i == s.length()-1){
			if(i == s.length()-1){
				s1 = s.substring(start+1 , i+1);
			}else{
				s1 = s.substring(start+1 , i);
			}
			if(s1.length() > s2.length()){
				s2=s1;
			}
			start=i;
		}
	}
	System.out.println(s2);
	}
}