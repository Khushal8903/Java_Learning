//Write a program to print numbers from n down to 1 using recursion.
import java.util.*;
public class numPrintnTo1{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	numPrint(n);
	
	
	}
	public static int numPrint(int a){
		if(a==0){
		 return 0;
		}
		System.out.println(a +" ");
		return numPrint(--a);
			
	}
}
