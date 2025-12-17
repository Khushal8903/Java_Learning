/*
1. Question:
Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
Manager gets a 20% bonus on salary.


Developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.
*/
import java.util.*;
public class Q1{
	public static void main(String []x){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Name of the Manager: ");
	String name = sc.nextLine();
	System.out.println("Enter the Salary of the Manager: ");
	int sal = sc.nextInt();
	sc.nextLine();
	Manager m = new Manager();
	m.setData(name ,sal);
	
	System.out.println("Enter the Name of the Developer: ");
	String name1 = sc.nextLine();
	System.out.println("Enter the Salary of the Developer: ");
	int sal1 = sc.nextInt();
	Developer d = new Developer();
	d.setData(name1 ,sal1);
	
	 System.out.println("\n--- Salary Details ---");
        System.out.println("Manager Name: " + m.name);
        System.out.println("Total Salary (with bonus): " + m.getSalary());

        System.out.println("Developer Name: " + d.name);
        System.out.println("Total Salary (with bonus): " + d.getSalary());
	
	
	
	}
}

class Employee{
	String name;
	int salary;
	
	void setData(String name , int salary){
		this.name=name;
		this.salary=salary;
	}
	
	double getSalary(){
		return salary;
	}
	
	
}

class Manager extends Employee{
	double getSalary(){
		return salary+salary*0.20;
	}
	
	
}
class Developer extends Employee{
	double getSalary(){
		return salary+salary*0.10;
	}

	
}