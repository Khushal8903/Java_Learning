/*
Q36. Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.
*/
import java.util.*;
public class CompNumApp{
	public static void main(String X[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the First Number:");
	int num1 = sc.nextInt();
	System.out.printf("Enter the Second Number:");
	int num2 = sc.nextInt();
	 if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is smaller than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
	}
}