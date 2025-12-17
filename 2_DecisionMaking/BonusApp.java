/*Q34. Check whether a given employee is eligible for bonus:
 
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.
*/
import java.util.*;
public class BonusApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Year of service: ");
        int year = sc.nextInt();
		System.out.printf("Enter the Salary:");
		int sal = sc.nextInt();
		
		if(year >  5){
		int bonus = sal*5/100;
		System.out.println("Salary is :"+ sal+"\nBonus is :" + bonus);
		}else{
		System.out.printf("No Bonus");
}}}