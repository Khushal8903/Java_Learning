/*
2. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations.
*/
import java.util.*;
class Employee{
	private String name;
	private int salary;
	private String dept;
	
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
	
	void setSalary(int salary){
		this.salary = salary;
	}
	int getSalary(){
		return salary;
	}
	
	void setDept(String dept){
		this.dept = dept;
	}
	String getDept(){
		return dept;
	}
}

class EmployeeSalaryIncrement{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		
		System.out.print("Enter the Name of Employee:");
		String s = sc.nextLine();
		e.setName(s);
		
		System.out.print("Enter the Salary:");
		int sal = sc.nextInt();
		sc.nextLine();
		
		e.setSalary(sal);
		System.out.print("Enter the Department");
		String d = sc.nextLine();
		e.setDept(d);
		
		int sal1 = e.getSalary();
		sal1 =sal1 + (sal1*10)/100;
		
		e.setSalary(sal1);
		System.out.println();
		System.out.println(e.getName()+"\t"+ e.getSalary() + "\t" + e.getDept());
		
	}
}