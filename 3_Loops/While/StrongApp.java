/*
Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2,145,
*/
import java.util.*;
public class StrongApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
         int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int n = num % 10;
            int f = 1;
			
			while(n != 0){
				f =f * n;
				n--;
			}

            sum = sum +f ;
            num =num/10;
        }
	String str = sum == originalNum ? "Strong" : "Not Strong";
	System.out.printf(str);
	}}
	