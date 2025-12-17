//Q56. Given (x, y), print quadrant I, II, III, IV or "Axis".
import java.util.*;
public class AxisQua{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the X axis value:");
	int a =  sc.nextInt();
	System.out.printf("Enterr the Y axiz value:");
	int b = sc.nextInt();
	
	String str = a>0 && b>0 ? "I Quadrant" :
				 a<0 && b>0 ? "II Quadrant":
				 a<0 && b<0 ? "III Quadrant" : 
				 a>0 && b<0 ? "IV Quadrant": "On Axis" ;
				 
	System.out.printf(str);
				 
	
	}
}