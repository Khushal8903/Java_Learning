/*
 Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
                                	Basic Salary <= 10000 : HRA = 20%, DA = 80%
                                	Basic Salary <= 20000 : HRA = 25%, DA = 90%
                                	Basic Salary > 20000 : HRA = 30%, DA = 95%
 
*/
import java.util.*;
public class SApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Salary:");
	int bs = sc.nextInt();
	int hra , da, gs;
	if(bs<=10000){
	  hra = bs*20/100;
	  da = bs*80/100;
	  gs= hra+da;
	  System.out.printf("Gross Salary: %d" ,gs); 
	}else if(bs>10000 && bs <= 20000){
	  hra = bs*25/100;
	  da = bs*90/100;
	  gs = bs+hra;
	  System.out.printf("Gross Salary: %d" , gs);
	}else{
	  hra = bs*30/100;
	  da = bs*95/100;
	  gs = hra+da;
	  System.out.printf("Gross Salary: %d" , gs);
	}
	
	
	}
}