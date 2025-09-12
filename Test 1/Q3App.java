//  Q3. Write a java program to enter two angles of a triangle and find the third angle. 
import java.util.*;
public class Q3App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the First Angle:");
	int Agl1 = sc.nextInt();
	System.out.printf("Enter the Second Angle:");
	int Agl2 = sc.nextInt();
	
	int Agl3 = 180 -(Agl1+Agl2);
	
	System.out.printf("Third Angle is: %d " , Agl3);
	}
}