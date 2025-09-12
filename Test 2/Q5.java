/*
Q5. Write a Java program to display the following series using function :  
 3   6   12   24   48   96  192  
 (Each term doubles from the previous term starting at 3)
*/
import java.util.*;
public class Q5{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	priSeries(7);
	}
	
	public static void priSeries(int n){
			int a=3;
			while(n!=0){
				System.out.print(a+" ");
				 a = a*2;
				
				
				n--;
			}
	}
}