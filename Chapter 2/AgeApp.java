/*
Q35. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.
*/
import java.util.*;
public class AgeApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the age:");
	int age = sc.nextInt();
	
	 if (age < 0) {
            System.out.println("Invalid age!");
        } else if (age <= 12) {
            System.out.println("The person is a Child.");
        } else if (age <= 19) {
            System.out.println("The person is a Teenager.");
        } else if (age <= 59) {
            System.out.println("The person is an Adult.");
        } else {
            System.out.println("The person is a Senior.");
        }}
}