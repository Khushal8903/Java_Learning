/*
Check Even or Odd


Write a function isEven(int n) that returns true if the number is even, otherwise false.


Test the function with user input.
*/
import java.util.*;
public class CheckEvenorOdd{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the input:");
	int p = sc.nextInt();
	
	boolean res = isEven(p);
	String str = res ?"True":"False";
	
	System.out.print(str);
	
	}
		public static boolean isEven(int a){
			if(a%2==0){
				return true;
			}else{
				return false;
			}
			
		}
	
	}