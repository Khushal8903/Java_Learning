/*
Q60. Create a Java program to simulate a basic food ordering system using switch:
 1: Burger
 2: Pizza
 3: Pasta
 4: Sandwich
 Display the price for the selected item.
Explanation:
 Switch on food item number. Print item name and price. Default for invalid selection.
*/
import java.util.*;
public class Menu60Food{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("1: Burger\n2: Pizza\n3: Pasta\n4: Sandwich\n Enter the Food Item:");
	int num = sc.nextInt();
	switch(num){
	case 1:
		System.out.printf("110/-");
		break;
	case 2:
		System.out.printf("249/-");
		break;
	case 3:
		System.out.printf("49/-");
		break;
	case 4:
		System.out.printf("79/-");
		break;
	default:
		System.out.printf("Invalid Selection");
		break;
	}
	
}}
