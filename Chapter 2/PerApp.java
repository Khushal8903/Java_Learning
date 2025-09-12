//Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.
import java.util.*;
public class PerApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Enter the Score:");
	int sr = sc.nextInt();
	if(sr <= 100){
		if(sr >=90){
			System.out.printf("Excellent");
		}else if(sr >=75){
			System.out.printf("Good");
		}else if(sr>=50){
		    System.out.printf("Average");
		}else if(sr < 50){
		    System.out.printf("Poor");
		}}else{
		System.out.printf("Invalid Marks");
		}
}}