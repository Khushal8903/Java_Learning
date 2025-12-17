/*
 Write a menu-driven program using do-while and switch-case to perform operations on  a bank account balance (initial balance entered by user):
Deposit money.
Withdraw money (only if sufficient balance).
Check current balance.
Exit.
Program should repeatedly allow operations until exit.
*/

import java.util.*;
public class Menu1{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Balance:");
	int Bal= sc.nextInt();
	int ch=0;
	do{
		System.out.println("\n------ Bank Menu ------");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

	switch(ch){
	    case 1:
			System.out.printf("Deposite Money:");
			 Bal += sc.nextInt();
			 break;
		case 2:
			System.out.printf("Enter the Withdraw Money:");
			 int wd = sc.nextInt();
			 Bal -=wd;
			 break;
		case 3:
			System.out.printf("Current Balance: %d", Bal);
			break;
		case 4:
		System.out.printf("Exit");
			
			break;
		default:
			System.out.printf("Invalid Input");
	}
	}
		while(ch!=4);
	}
	
	}
