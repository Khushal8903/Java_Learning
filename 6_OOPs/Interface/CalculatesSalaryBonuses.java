/*
Q3. Create a system that calculates salary bonuses for different types of employees.
Requirements
Create abstract class Employee:
name, id, baseSalary
abstract method: double calculateBonus()

Create interface Performance:
int getRating()
Rating: 1–5 (5 = best)
Create child classes:
Developer
Manager
SalesExecutive

Bonus Logic:
Developer → baseSalary × rating × 0.05
Manager → baseSalary × rating × 0.08
SalesExecutive → baseSalary × rating × 0.04 + (sales × 0.03)

Perform operations:
Input rating
Input sales (only for SalesExecutive)
Calculate final salary = baseSalary + bonus

Display all details
Explanation
Validates:
Abstract + interface combination
Role-specific calculations
Dynamic runtime polymorphism
*/

import java.util.*;

interface Performance{

	int getRating();
}

abstract class Employee implements Performance{
	String name;
	int id;
	int baseSalary;
	
	Employee(String name , int id , int baseSalary){
		this.name = name;
		this.id=id;
		this.baseSalary=baseSalary;
	}
	
	abstract double calculateBonus();
}



class Developer extends Employee {
	int rating;
	
	Developer(String name , int id , int baseSalary , int rating){
		super(name ,id  , baseSalary);
		this.rating=rating;
	}
	
	public int getRating(){
		return rating;
		}
	
	public double calculateBonus(){
		return baseSalary * rating * 0.05;
	}
	
}
class Manager extends Employee {
	int rating;
	
	Manager(String name , int id , int baseSalary , int rating){
		super(name ,id  , baseSalary);
		this.rating=rating;
	}
	
	public  int getRating(){
		return rating;
		}
	
	public double calculateBonus(){
		return baseSalary * rating * 0.08;
	}
}
class SalesExecutive extends Employee {
	int rating;
	int sales;
	SalesExecutive(String name , int id , int baseSalary , int rating , int sales){
		super(name ,id  , baseSalary);
		this.rating=rating;
		this.sales=sales;
	}
	
	public int getRating(){
		return rating;
		}
	
	public double calculateBonus(){
		return  baseSalary * rating * 0.04 + (sales * 0.03);
	}
}

public class CalculatesSalaryBonuses{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the type of the employees: 1.Developer  2.Manager  3.SalesExecutive");
		int type = sc.nextInt();
		System.out.println("Enter the name of the Employee:");
		String name = sc.next();
		System.out.println("Enter the id of the Employee:");
		int id = sc.nextInt();
		System.out.println("Enter the baseSalary of the Employee:");
		int baseSalary = sc.nextInt();
		System.out.println("Enter the rating of the Employee:");
		int rating = sc.nextInt();
		
		Employee e = null;
		
		switch(type){
			case 1:
				e= new Developer(name , id , baseSalary , rating);
				break;
			case 2:
				e= new Manager( name ,  id ,  baseSalary ,  rating);
				break;
			case 3:
				System.out.println("Enter the sales of the SalesExecutive:");
				int sales = sc.nextInt();
				e= new SalesExecutive( name ,  id ,  baseSalary ,  rating ,  sales);
				break;
			
			default:
				System.out.println("Enter the valid Input");
				
		}
		double bonus = e.calculateBonus();
		System.out.println("-------------------------- Salary ----------------------------");
		System.out.println("Name of the Employee : " +e.name);
		System.out.println("Id of the Employee : " +e.id);
		System.out.println("Base Salary of the Employee : " +e.baseSalary);
		System.out.println("rating of the Employee : " +e.getRating());
		System.out.println("Final Salary of the Employee : " +(e.baseSalary + bonus));

		
		
	}
} 