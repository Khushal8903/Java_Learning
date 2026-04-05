import java.util.*;
public class RemoveSpace{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		s = s.replaceAll(" " , "");
		System.out.println(s);
	}
}