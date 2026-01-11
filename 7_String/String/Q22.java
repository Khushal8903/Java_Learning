/*
Q22. Print only unique characters while maintaining original order.
 Input : banana
 Output : ban
*/
import java.util.*;
public class Q22{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	String s = sc.nextLine();
	
	ArrayList<Character> al = new ArrayList<>();
	
	for(int i=0;i<s.length();i++){
			if(al.contains(s.charAt(i))){
				continue;
			}else{
				al.add(s.charAt(i));
			}
	}
	for(char ch : al){
		System.out.print(ch);
	}
	}
}