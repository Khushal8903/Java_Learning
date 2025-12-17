/*
Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees.
Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.
*/
import java.util.*;
class Employee{
	private int empId;
	private String name;
	private int basicSalary;
	private int hra;
	private int da;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	
}

public class GrossSalaryApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Employee e[] = new Employee[5];
	for(int i=0 ; i<e.length;i++){
		e[i]=new Employee();
		System.out.print("Enter the empId, name, basicSalary, hra, and da:");
		e[i].setEmpId(sc.nextInt());
		e[i].setName(sc.next());
		e[i].setBasicSalary(sc.nextInt());
		e[i].setHra(sc.nextInt());
		e[i].setDa(sc.nextInt());
	}
	
	System.out.println("\nGross salary of each employee:");

	int maxSal=0,pi=0,total=0;
	for(int i=0 ; i<e.length; i++){
		int gs=0;
		
		gs = e[i].getBasicSalary()+e[i].getDa()+e[i].getHra() ;
		System.out.println("Gross Salary of the Employee "+(i+1)+ " is:"+ gs);
		total = total+gs;
		
		if(gs>maxSal){
			maxSal=gs;
			pi = i;
		}	
	}
	System.out.println("\nThe name and id of employee with maximum salary: "+e[pi].getEmpId()+"  "+e[pi].getName());
	int avg = total/e.length;
	System.out.println("\nEmployees whose salary is greater than the average salary of all employees:");
	for(int i=0 ; i<e.length ;i++){
		if(avg<(e[i].getBasicSalary()+e[i].getDa()+e[i].getHra())){
			System.out.println(e[i].getName());
		}
	}
	
	}
}
