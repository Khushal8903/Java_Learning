//Q48. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
import java.util.*;
public class ScoreApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the marks:");
	int num =  sc.nextInt();
	
	String str = num > 40 ? "Pass" : "Fail" ;
	System.out.println(str);
	}
}