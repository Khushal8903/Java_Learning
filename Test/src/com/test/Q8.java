package com.test;
import java.util.*;
public class Q8 {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		Vector<String> v = new Vector<>();
		
		do {
			System.out.println(
					 "1. Insert 5 cities. \r\n"
					+ "2. Remove the city at index 3. \r\n"
					+ "3. Insert a new city at index 1. \r\n"
					+ "4. Display final list.");
				int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the data of 5 cities:");
				for(int i=0;i<5 ; i++) {
					v.add(sc.next());
				}
				break;
				
			case 2:
				v.remove(3);
				break;
			case 3:
				v.add(1 , sc.next());
				break;
			case 4 : 
				for(String s : v) {
					System.out.println(s);
				}
				break;
			default :
				System.out.println("Invalid input");
			}
			
		}while(true);
		
		
		
	}
}
