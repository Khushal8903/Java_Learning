import java.util.*;
public class CountWord{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		s = s.trim();
		String str[] = s.split("\\s+");
		System.out.println(str.length);
	}
}