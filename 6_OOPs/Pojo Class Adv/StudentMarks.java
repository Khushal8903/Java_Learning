/*
Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations.
*/

import java.util.*;
class Student{
	private int rollNo;
	private String name;
	private int marks[];
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	 
}
public class StudentMarks{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Student  s[] = new Student[5];
	
	for(int i=0 ; i<s.length ; i++){
		s[i] =new Student();
		System.out.println("Enter the RollNo of the Student:");
		s[i].setRollNo(sc.nextInt());
		System.out.println("Enter the Name of the Student:");
		s[i].setName(sc.next());
		System.out.println("Enter the three Subject marks(Math , Chem , Phy):");

		int m[] = new int[3];
		for(int j=0 ;j<m.length ;j++){
			m[j]=sc.nextInt();
		}
			s[i].setMarks(m);
	}
	
	double avg1=0;
	int ta = 0;
	for(int i=0 ; i<s.length;i++){
		int total=0;

		for(int j=0 ; j<s[i].getMarks().length;j++){
			total = total+s[i].getMarks()[j];
		}
		double avg =(double) total/3;
		
		if(avg>avg1){
			avg1 = avg;
			ta=i;
		}
		
	}
	System.out.println("Highest Average marks of the student is:\n"+"RollNo:" +s[ta].getRollNo() +"\nName:" +s[ta].getName());
	for(int i=0 ; i<s.length ;i++){
		boolean f=true;
		for(int j=0 ; j<s[i].getMarks().length ; j++){
			
			if(s[i].getMarks()[j] <=35){
				f = false;
				break;
				
			}
		}
			if(!f){
				System.out.print("Students who have failed in any subject:\n"+"RollNo:" +s[i].getRollNo() +"\nName:" +s[i].getName());
			}
		
	}
	}
}