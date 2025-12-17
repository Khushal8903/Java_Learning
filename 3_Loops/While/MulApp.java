//9.Write a C program to print a multiplication table of any number.
import java.util.*;
public class MulApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number for table:");
	int num = sc.nextInt();
	int i=1, n;
	while(i<=10){
	    n =i*num;
		System.out.println(n);
		i++;
	}
	
	}
}