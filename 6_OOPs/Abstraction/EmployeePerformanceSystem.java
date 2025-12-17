/*
Q4. Employee Performance System – Abstract Score Calculation
Abstract class: Employee
Fields:
name, id
Method:
abstract int performanceScore()

Child classes:
Developer
Score = completedTasks × 10
Tester
Score = bugsFound × 5
Manager
Score = teamHandled × 20 + projectsDelivered × 15

Task:
Create 8 employees of mixed types.
Calculate score for each user.
Print employees who have score ≥ 80.
Explanation:
Demonstrates:
Abstract method implemented differently
Logical operations based on multiple fields
Filtering objects with conditions
*/
import java.util.*;
abstract class Employee{
	String name ;
	int id;
	
	Employee(String name , int id){
		this.name = name;
		this.id=id;
	}
	abstract int performanceScore();
}
class Developer extends Employee{
	
	int task;
		
	Developer(String name , int id , int task){
		super(name , id);
		this.task=task;
	}
	
	public int performanceScore(){
		return task*10;
	}
}
class Tester extends Employee{
	
	int bug;
		
	Tester(String name , int id , int bug){
		super(name , id);
		this.bug=bug;
	}
	
	public int performanceScore(){
		return bug*5;
	}
}
class Manager extends Employee{
	
	int projectsDelivered;
	int teamHandled;
		
	Manager(String name , int id , int projectsDelivered , int teamHandled){
		super(name , id);
		this.projectsDelivered=projectsDelivered;
		this.teamHandled=teamHandled;
	}
	
	public int performanceScore(){
		return teamHandled*20 + projectsDelivered*15;
	}
}
class EmployeePerformanceSystem{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		Employee ep[] = new Employee[4];
		
		for(int i=0 ; i<ep.length ;i++){
			System.out.println("Enter the type od te Employee: 1.Developer  2.Tester  3.Manager");
			int type = sc.nextInt();
			System.out.println("Enter the Name and Id of the Employee:");
			String name = sc.next();
			int id=sc.nextInt();
			
			switch(type){
				case 1:
					System.out.println("Enter the no of Task done:");
					int task=sc.nextInt();
					ep[i] = new Developer(name , id , task);
					break;
				case 2:
					System.out.println("Enter the no of Bug found:");
					int bug=sc.nextInt();
					ep[i] = new Tester(name , id , bug);
					break;
				case 3:
					System.out.println("Enter the no of teamHandled and projectsDelivered:");
					int th=sc.nextInt();
					int pd=sc.nextInt();
					ep[i] = new Manager(name , id , th , pd);
					break;
				default : 
					System.out.println("Invalid Input");
					i--;
			}
			
		}
		printEmp(ep);
	}
	
	public static void printEmp(Employee ep[]){
		
		
		System.out.println("-----------------------------------------------------");
		System.out.println(" \t Employee \t\t Id \t\t Name \t\t Final-Score ");
		System.out.println("-----------------------------------------------------");

		for(int i=0 ; i<ep.length;i++){
		
			if(ep[i].performanceScore() >= 80){
			
				System.out.println((i+1) +"\t" +ep[i].getClass().getSimpleName() +" \t\t "+ ep[i].id+" \t\t "+ep[i].name+" \t\t "+ep[i].performanceScore() );
				}
			
			}
		System.out.println("-----------------------------------------------------");
		
	}
}