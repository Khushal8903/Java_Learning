/*
Q59. Write a program using switch that takes a number (1-4) and displays a season:
 1: Spring
 2: Summer
 3: Autumn
 4: Winter
Explanation:
 Simple switch with four cases and default for invalid input.
*/

import java.util.*;
public class Menu59Season{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("1: Spring\n2: Summer\n3: Autumn\n4: Winter\nEnter the Choice:");
	int num = sc.nextInt();
	switch(num){
	case 1:
		System.out.printf("Spring");
		break;
	case 2:
		System.out.printf("Summer");
		break;
	case 3:
		System.out.printf("Autumn");
		break;
	case 4:
		System.out.printf("Winter");
		break;
	}
	}
}