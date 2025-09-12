//Q49. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)

import java.util.*;
public class ScoreCard{
		public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the Score:");
		int score = sc.nextInt();
		
		String str = 100 <= score && score >= 90 ? "Excellent" : 
		90 < score && score >=75 ? "Good" : 
		75 < score && score > 50 ? "Average" : "Poor" ;
		
		
		System.out.printf(str);
		
		
		}
}