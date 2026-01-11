/*
Q26. Write a java program to check each word separately to see if it reads same forward and backward.
 Input : madam level noon java
 Output : madam level noon
*/
import java.util.*;
public class Q26{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	String str = sc.nextLine();
	
	ArrayList<String> al = new ArrayList<>();
	int s=-1;
	String s1 = "";
	String s2 = "";
	for(int i=0;i<str.length();i++){
		if(str.charAt(i) == ' ' || i==str.length()-1){
			if(i==str.length()-1){
				 s1 = str.substring(s+1 , i+1);
				 s2 = new StringBuilder(s1).reverse().toString();
				
			}else{
				 s1 = str.substring(s+1 , i);
				 s2 = new StringBuilder(s1).reverse().toString();
			}
			s=i;
			if(s1.equals(s2)){
					al.add(s1);
				}
			
		}
	}
	System.out.println(al);
	}
}