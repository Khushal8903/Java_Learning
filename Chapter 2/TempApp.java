/*
  Q40. Classify temperature reading:
 
Input: Temperature in Celsius
Logic:
<0 → Freezing
0–20 → Cold
21–35 → Warm
35 → Hot
Output: Display weather type.
*/
import java.util.*;
public class TempApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Enter the Temperature in Celsius:");
	int temp = sc.nextInt();

	if(temp <0){
	System.out.printf("Freezing");
	}else if(temp >=0 && temp<=20){
	System.out.printf("Cold");
	}else if(temp >=21 && temp<35){
	System.out.printf("Warm");
	}else if(temp > 35){
	System.out.printf("Hot");
	}
	
	}
}