import java.util.*;
public class MulNum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	String str = (num%3==0) &&(num%5==0) ? "Divisible by both" : "Not Divisible by both";
	System.out.println(str);
	
	}

}