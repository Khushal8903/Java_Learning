//Q15. Write a java program to find the minimum between two numbers.
import java.util.*;
public class MinTwoApp{
	public static void main(String xx[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the First no:");
	int a = sc.nextInt();
	System.out.printf("Enter the Second no:");
	int b = sc.nextInt();
	
	if(a>b){
	System.out.println(b);
	}else{
	System.out.println(a);
	}}}