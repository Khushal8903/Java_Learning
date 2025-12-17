//Write a program to print numbers from 1 to n using recursion.
import java.util.*;
public class numPrint1Ton{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	numPrint(n);
	
	
	}
	public static void numPrint(int a){
		if(a==0){
		 return;
		}
		 numPrint(a-1);
		System.out.println(a +" ");
		
			
	}
}
