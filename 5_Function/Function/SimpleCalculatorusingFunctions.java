/*
Simple Calculator using Functions


Write separate functions:


add(int a, int b)


subtract(int a, int b)


multiply(int a, int b)


divide(int a, int b)


Call them based on user choice.
*/

import java.util.*;
public class SimpleCalculatorusingFunctions{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number:");
	int p=sc.nextInt();
	System.out.print("Enter the second number:");
	int q=sc.nextInt();
	System.out.print("Enter the choice:\n1)Add\n2)Sub\n3)Mul\n4)Div\n");
	
	int ch = sc.nextInt();
	int res = 0;
	switch(ch){
		case 1:
			res = Add(p ,q);
			break;
		case 2:
			res = Sub(p ,q);
			break;
		case 3:
			res = Mul(p ,q);
			break;
		case 4:
			res = Div(p ,q);
			break;
	}
	
	
	System.out.print(res);
	
	}
	
	
	
		public static int Add(int a , int b){
				return a+b;
		}
		public static int Sub(int a , int b){
				return a-b;
		}
		public static int Mul(int a , int b){
				return a*b;
		}
		public static int Div(int a , int b){
					return a/b;
		}
	
	}