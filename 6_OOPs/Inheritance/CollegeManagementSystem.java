/*
	Q1. Problem Statement :
	Write a Java program to design a College Management System using the concept of inheritance.
	The system should maintain and process details of both Students and Faculty members.
	Use one parent class and two child classes, and perform ten sequential operations related to student and faculty management.
	Class Structure:
	Parent Class – Person
	Data Members:
	 int id, String name, String address, String contactNo
	Member Methods:
	addDetails() – Accept and store basic person details.
	displayDetails() – Display details of a person.
	updateAddress() – Update the address of a person.
	updateContact() – Update contact number.
	showBasicInfo() – Display ID, name, and contact number.
	Child Class 1 – Student extends Person
	Additional Data Members:
	String courseName, int marks[3], double percentage
	Additional Methods:
		6. enterMarks() – Accept marks of three subjects.
		7. calculatePercentage() – Calculate and store percentage based on marks.
	Child Class 2 – Faculty extends Person
	Additional Data Members:
	String subject, double salary, int experience
	Additional Methods:
	   8. assignSubject() – Assign subject to faculty.
	   9. calculateIncrement() – Increase salary by 10% if experience is greater than 5 years.
	  10. displayFacultyInfo() – Display faculty’s subject, salary, and experience.


	Operations to Perform (Sequentially):
	Add student details using addDetails() method.
	Enter marks for three subjects using enterMarks().
	Calculate and store the student’s percentage using calculatePercentage().
	Update the student’s contact number using updateContact().
	Display all details of the student using displayDetails().
	Add faculty details using addDetails() method.
	Assign subject to faculty using assignSubject().
	Calculate salary increment for the faculty using calculateIncrement().
	Update the faculty’s address using updateAddress().
	Display complete faculty information using displayFacultyInfo().
	Instructions:
	Use constructors in all classes for initialization.
	Use the super keyword to call parent constructors in child classes.
	Apply method overriding for displayDetails() to show specific outputs for each child class.
	Perform all 10 operations sequentially in the main() method.
	Do not use collections; use arrays or primitive variables only.
*/

import java.util.*;
public class CollegeManagementSystem{
	public static void main(String x[]){
	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("1. Enter 1 for student \t 2. Enter 2 for faculty");
	 int ch = sc.nextInt();
	 
	 switch(ch){
		 
		 case 1:
		 // Student 
		 
		
        System.out.println("Enter Student Details:");
        System.out.print("ID: ");
        int sid = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String sname = sc.nextLine();
        System.out.print("Address: ");
        String saddr = sc.nextLine();
        System.out.print("Contact: ");
        String scontact = sc.nextLine();
        System.out.print("Course: ");
        String course = sc.nextLine();

        Student student = new Student(sid, sname, saddr, scontact, course);

        System.out.print("Enter 3 subject marks: ");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
        student.enterMarks(m1, m2, m3);

        student.calculatePercentage();

        sc.nextLine();
        System.out.print("Enter new contact number for student: ");
        String newContact = sc.nextLine();
        student.updateContact(newContact);

        student.displayDetails();

		break;
		
		case 2:
		System.out.println("\nEnter Faculty Details:");
        System.out.print("ID: ");
        int fid = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String fname = sc.nextLine();
        System.out.print("Address: ");
        String faddr = sc.nextLine();
        System.out.print("Contact: ");
        String fcontact = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Experience (in years): ");
        int exp = sc.nextInt();
        sc.nextLine();

        Faculty faculty = new Faculty(fid, fname, faddr, fcontact, salary, exp);

   
        System.out.print("Enter subject for faculty: ");
        String subject = sc.nextLine();
        faculty.assignSubject(subject);

      
        faculty.calculateIncrement();

      
        System.out.print("Enter new address for faculty: ");
        String newAddr = sc.nextLine();
        faculty.updateAddress(newAddr);

        
        faculty.displayFacultyInfo();
		
		break;
		
		default:
		 System.out.println("Default Input!....");
	 }
	   
    }
}

class Person{
	int id;
	String name;
	String address;
	String contactNo;
	
	Person p[];
	Scanner sc = new Scanner(System.in);
	
	Person(int id , String name , String address, String contactNo){
		this.id=id;
		this.name=name;
		this.address=address;
		this.contactNo=contactNo;
		
	}
		
	public void displayDetails(){
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Adress: " + address);
		System.out.println("Contact No.: " + contactNo);	
		
	} 
	public void updateAddress(String address){
		this.address=address;
		
	}
	public void updateContact(String contactNo){
		this.contactNo=contactNo;
		
	} 
	public void showBasicInfo(){
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Contact No.: " + contactNo);
	}
}

class Student extends Person{
	String courseName;
	int marks[] = new int[3];
	double percentage;
	
	Student(int id , String name , String address, String contactNo, String courseName){
			super(id , name , address , contactNo );
			this.courseName=courseName;
	}
	
	public void enterMarks(int m1 , int m2 , int m3){
		this.marks[0]=m1;
		this.marks[1]=m2;
		this.marks[2]=m3;
		
	} 
	
	public void calculatePercentage(){
		int total = marks[0]+marks[1]+marks[2];
		this.percentage = (double)(total*3)/100;
		
	}

	public void displayDetails(){
		super.displayDetails();
			System.out.println("Course Name :" + courseName);
			System.out.println("Percentage :"+ percentage);
		
	}	

	
}
class Faculty extends Person{
	
	String subject;
	double salary;
	int experience;
	
	Faculty(int id , String name , String address, String contactNo  , double salary,int experience){
		super( id , name ,address,contactNo);
		this.experience=experience;
		this.salary=salary;
	}
	public void assignSubject(String subject){
		this.subject=subject;
	}
	
	public void calculateIncrement(){
		if(experience > 5){
			this.salary = salary+salary*0.10;
		}
	}

	public void displayFacultyInfo(){
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Adress: " + address);
		System.out.println("Contact No.: " + contactNo);
		System.out.println("Subject: " + subject);
		System.out.println("Experience : " + experience);
		System.out.println("Salary : " + salary);
		
		
	}


}