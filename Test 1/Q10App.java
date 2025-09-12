/*
Q10. Write a menu-driven program in java using switch case. 
            1. input any alphabet and check whether it is vowel or consonant. 
            2.Find the max number using 3 numbers. 
            3. input any number & check number is divisible by 5 & 11.*/
import java.util.*;
public class Q10App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("1. input any alphabet and check whether it is vowel or consonant.\n2.Find the max number using 3 numbers. \n3. input any number & check number is divisible by 5 & 11.\nEnter the Choice: ");
	int num = sc.nextInt();
	switch(num){
	case 1:
		System.out.printf("Enter the Character:");
		char ch = sc.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
			System.out.printf("Alphabet");
		}else if(ch >= '0' && ch <= '9'){
			System.out.printf("Digit");
		}else{
			System.out.printf("Character");
		}
		break;
	case 2:
	    System.out.printf("Enter the First Number:");
			int a = sc.nextInt();
		System.out.printf("Enter the Second Number:");
			int b = sc.nextInt();
		System.out.printf("Enter the Third Number:");
			int c = sc.nextInt();
		if(a>b && a>c){
		  System.out.printf("First number is Maximum");
		}else if(b>a && b>c){
		   System.out.printf("Second number is Maximum");
		}else{
			 System.out.printf("Third number is Maximum");
		}
		break;
	case 3:
	    System.out.printf("Enter the  Number:");
			int num1 = sc.nextInt();
		if(num1%5 ==0 && num1%11==0){
			System.out.printf("Divisible by 5 and 11");
		}else{
			System.out.printf("Not Divisible by 5 and 11");
		}
		break;
	default:
		System.out.printf("Invalid Input");
	}


	}
}