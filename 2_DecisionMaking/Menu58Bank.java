/*
Q58. Develop a program to simulate a basic banking menu:
 1: Deposit
 2: Withdraw
 3: Check Balance
 4: Exit
 Use a switch to handle user choice and print appropriate messages.
Explanation:
 Switch on user choice. Use variables for balance and update accordingly.
*/
import java.util.*;
public class Menu58Bank{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("1: Deposit\n2: Withdraw\n3: Check Balance\n4: Exit\nEnter the Choice:");
	int num = sc.nextInt();
	int Bal = 0 ;
	switch(num){
	case 1:
		System.out.printf("Enter Deposit Amt:");
		int dp = sc.nextInt();
		Bal = Bal +dp;
	case 2:
		System.out.printf("Enter the Withdraw Amt:");
		int wd = sc.nextInt();
		Bal =  Bal - wd;
	case 3:
		System.out.println(Bal);
	case 4:
		System.out.println("Exit");
		
	}
	}
}