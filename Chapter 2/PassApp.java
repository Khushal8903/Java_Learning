//Q18. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
import java.util.*;
public class PassApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.printf("Enter the Score:");
	int sr = sc.nextInt();
	if(sr >= 40){
	System.out.printf("Pass");
	}else{
	System.out.printf("Fail");
	}
	}}