/*
Q1. Problem:
 Create a class Employee with fields:
empId, empName, basicSalary, hra, da, and grossSalary.
Use a parameterized constructor to initialize empId, empName, and basicSalary.
 HRA = 10% of basic, DA = 15% of basic, and Gross = Basic + HRA + DA.
 Display all employee details and salary slip.
Hint: Use constructor to calculate the salary.
*/

import java.util.*;
class CreateaclassEmployeewithfields{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the emp:");
		String name = sc.nextLine();
		System.out.println("Enter the Id of the emp:");
		int id = sc.nextInt();
		System.out.println("Enter the Basic Salary of the emp:");
		int bs = sc.nextInt();
		
		Employee e = new Employee(id , name , bs);
			e.Disp(bs);
	}
}
class Employee{
	private int empId;
	private int basicSalary;
	private String empName;
	
	Employee(int empId , String empName , int basicSalary){
		this.empId=empId;
		this.empName=empName;
		this.basicSalary=basicSalary;
	}
	
	public double calHra(int basicSalary){
		return (double)((basicSalary*10)/100);
	}
	
	public double dA(int basicSalary){
		return (double)((basicSalary*15)/100);
	}
	public double grossSalary(int basicSalary){
		double gs = (double)(dA(basicSalary) + calHra(basicSalary) + basicSalary);
		return gs;
	}
	public void Disp( int basicSalary){
		System.out.println("EmpId:" + empId);
		System.out.println("EmpName:" + empName);
		System.out.println("Basic:" + basicSalary);
		System.out.println("HRA:" + calHra(basicSalary));
		System.out.println("DA:" + dA(basicSalary));
		System.out.println("Gross Salary:" + grossSalary(basicSalary));
		
		
	}
	
}