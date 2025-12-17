/*
10. Question:
 Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.
ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.
Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.
*/
import java.util.*;
public class Q10{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("Salary: ");
	int sal = sc.nextInt();
	
	
	sc.nextLine();
	System.out.print("Name: ");
	String name1 = sc.nextLine();
	System.out.print("Salary: ");
	int sal1 = sc.nextInt();
	
	
	Employee s = new PermanentEmployee(sal , name);
	System.out.println("Employee Name: "+s.getName());
	System.out.println("Final Salary: "+s.calculateBonus());
	
	s = new ContractEmployee(sal1 , name1);
	System.out.println("Employee Name: "+s.getName());
	System.out.println("Final Salary: "+s.calculateBonus());

	
	}
}


class Employee{
	private String name;
		protected int sal;
	Employee(int sal , String name){
	this.name=name;
		this.sal=sal;
	}
	
	public String getName(){
		return name;
	}
	
	double calculateBonus(){
		return sal;
	}
	
}

class PermanentEmployee extends Employee{
	PermanentEmployee(int sal , String name){
		super(sal , name);
	}
	
	double calculateBonus(){
		return sal+sal*0.25;
	}
	
}

class ContractEmployee extends Employee{
	ContractEmployee(int sal , String name){
		super(sal , name);
	}
	
	double calculateBonus(){
		return sal+sal*0.10;
	}
	
}
