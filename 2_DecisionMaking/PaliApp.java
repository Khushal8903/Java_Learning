//Q22. Write a java program to check whether a number is palindrome or not. 
import java.util.*;
public class PaliApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number String:");
	int num = sc.nextInt();
	int last = num%10;
	 int temp = num/10;
	int middle = temp%10;
	temp = temp/10;
	int first = temp%10;
	
	int newnum = first*100+middle*10+last;
	
	if(newnum == num){
	System.out.printf("String is Palidrom");
	}else{
	System.out.printf("String is not Palidrom");
	}
	
	}
}