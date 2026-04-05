import java.util.*;
public class ReverseString{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		s = sb.reverse().toString();
		System.out.println(s);
	}
}