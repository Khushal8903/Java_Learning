/*
Q5. Employee Bonus Calculation - Interface with Multiple Rule Classes
Interface: BonusRules
Method:
double getBonus(double salary)

Implementing Classes:
PermanentEmployee
Bonus = 20% of salary
ContractEmployee
Bonus = 10%
Intern
Bonus = fixed ₹2000

Task:
Add 7 employees with different types.
Calculate and print final salary including bonus.
Count how many employees get bonus above 5000.
Explanation:
Covers:
Interface usage
Multiple implementations
Percentage vs fixed logic
Counting based on a condition
*/
import java.util.*;
interface BonusRules{
	public double getBonus(double salary);
}
class PermanentEmployee implements BonusRules{
	public double getBonus(double salary){
		return salary*0.20;
	}
}
class ContractEmployee implements BonusRules{
	public double getBonus(double salary){
		return salary*0.10;
	}
}class Intern implements BonusRules{
	public double getBonus(double salary){
		return 2000;
	}
}
public class EmployeeBonusCalculation{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		BonusRules ep[] = new BonusRules[7];
		double sal[] = new double[7];
		
		for(int i=0 ; i<ep.length ; i++){
		
			System.out.println("Enter the Employee Type : 1.PermanentEmployee  2.ContractEmployee  3.Intern");
			int type = sc.nextInt();
			System.out.println("Enter the Salary of the Employee:");
			 sal[i] = sc.nextDouble();
		
			
			switch(type){
				case 1:
					ep[i]=new PermanentEmployee();
					break;
				case 2:
					ep[i]=new ContractEmployee();
					break;
				case 3:
					ep[i]=new Intern();
					break;
				default:
					System.out.println("Invalid Input");
					i--;
			}
			
		}
		
		EmployeeBonusCalculation em = new EmployeeBonusCalculation();
		int cnt = em.getFinalSal(ep , sal);
		System.out.println("Total Employee having bonus Above >5000 : " + cnt);
	}
	
	public int getFinalSal(BonusRules ep[] , double sal[]){
	int cnt=0;
			System.out.println("----------------------------------------------");
			System.out.println("\t\tEmployee Type \t\t Bonus \t\t Total-Sal");
			System.out.println("----------------------------------------------");
			for(int i=0 ; i<ep.length ; i++){
				double bonus = ep[i].getBonus(sal[i]);
				if(bonus>5000) cnt++; 
				System.out.println("("+ (i+1) +")\t"+ ep[i].getClass().getSimpleName()+"\t\t"+(bonus) +"\t\t"+ (sal[i]+bonus));
			}
			System.out.println("----------------------------------------------\n");
		return cnt;
	}
	
	 
}
