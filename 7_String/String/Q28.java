/*
Q28. Write a java program to Check character whose frequency is 1 and appears first.
 Input : swiss
 Output : w
*/
import java.util.*;
public class Q28{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	String s = sc.nextLine();
	
	ArrayList<Character> al = new ArrayList<>();
	for(int i=0;i<s.length();i++){
		al.add(s.charAt(i));
	}
	for(int i=0;i<al.size();i++){
		char c =al.remove(0);	
			if(!al.contains(c)){
				System.out.println(c);
				break;
			}
		}
	}
}