import java.util.*;
public class CheckPalindrome{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		String s1 = sb.reverse().toString();
		System.out.println(s.equals(s1));
	}
}