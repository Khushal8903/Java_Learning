/*
Q44. Write a java program to input basic salary of an employee and calculate its Gross salary according to following.
Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%
*/

import java.util.*;
public class SalaryApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Basic Salary:");
	int bs = sc.nextInt();
	
	int hra1 = (bs*20) /100;
	int da1 = (bs*80)/100;
	
	int hra2 = (bs*25) /100;
	int da2 = (bs*90)/100;
	
	int	hra3 = (bs*30) /100;
	int da3 = (bs*95)/100;
	
	int GS = bs<=10000 ? bs+hra1+da1 : bs<=20000 ? bs+hra2+da2 : bs+hra3+da3;
	
	System.out.println(GS);
	
	}

}