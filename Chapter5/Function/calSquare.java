//Basic Function code
import java.util.*;
public class calSquare{
	public static void main(String x[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	System.out.println(calSquare(num));
	
	
	
	}
	public static int calSquare(int n){
			int sq = n*n;
			return sq;
	}
}