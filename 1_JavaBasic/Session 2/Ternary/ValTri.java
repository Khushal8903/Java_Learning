//Q32. Write a Java program to check whether a triangle is valid or not.
import java.util.*;
public class ValTri{
	public static void main(String []x){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("\n------------Cheaking on the base of Side Lenght------------ \n");
	System.out.printf("Enter the First side of triangle:");
	int side1 = sc.nextInt();
	System.out.printf("Enter the second side of triangle:");
	int side2 = sc.nextInt();
	System.out.printf("Enter the third side of triangle:");
	int side3 = sc.nextInt();
	
	String str = (side1+side2>side3) && (side2+side3>side1) && (side3+side1>side2)?"Tringle is Valide" : "Tringleis not valid" ;
	System.out.println(str);
	
	System.out.printf("\n------------Cheaking on the base of Angle of Triangle------------ \n");
	System.out.printf("Enter the first angle of the Tringle:");
	int Angle1 = sc.nextInt();
	System.out.printf("Enter the second angle of the Tringle:");
	int Angle2 = sc.nextInt();
	System.out.printf("Enter the third angle of the Tringle:");
	int Angle3 = sc.nextInt();
	
	String str1 = (Angle1+Angle2+Angle3) == 180 ? "Tringle is valid" : "Tringle is not valid" ;
	System.out.printf(str1);
	
	}
}