/*
Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2
*/

import java.util.*;
public class QuoDiv{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Dividend:");
	
	int Dividend = sc.nextInt();
	
	System.out.println("Enter the divisor:");
	
	int divisor = sc.nextInt();
	
	int Quotient = Dividend/divisor;
	int Remainder = Dividend%divisor;
	
	System.out.printf("Quotient : %d \n Dividend : %d " , Quotient , Remainder);
}}
