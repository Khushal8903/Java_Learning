// Q11. Write a java program to find a maximum between three numbers.
import java.util.*;
public class MThreeApp{
	public static void main(String xx[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the First no:");
	int a = sc.nextInt();
	System.out.printf("Enter the Second no:");
	int b = sc.nextInt();
	System.out.printf("Enter the Third no:");
	int c = sc.nextInt();
	
	if(a>b && a>c){
	System.out.printf("First no. is Max");
	}else if(b>a && b>c){
	System.out.printf("Second no. is Max");
	}else{
	System.out.printf("Thirdno. is Max");
	}
	}}