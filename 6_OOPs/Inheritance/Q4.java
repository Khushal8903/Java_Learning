/*
4. Question:
 Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.


Explanation:
 This tests inheritance for common fields and customized result display logic.
*/
import java.util.*;
public class Q4{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("Marks: ");
	int marks = sc.nextInt();
	sc.nextLine();
	
	System.out.print("Name: ");
	String name1 = sc.nextLine();
	System.out.print("Marks: ");
	int marks1 = sc.nextInt();
	
	Student s = new EngineeringStudent(name , marks);
	System.out.println("Name: "+s.getName());
	s.result();
	
	 s = new MedicalStudent(name1 , marks1);
	System.out.println("Name: "+s.getName());
	s.result();
	}
}
class Student{
	private String name;
	protected int marks;
	
	Student(String name , int marks){
		this.name = name;
		this.marks = marks;
	}
	
	public String getName(){
		return name;
	}
	
	void result(){
		if(marks>50){
			System.out.println("Passed");
		}else{
			System.out.println("Failed");
		}
	}
	
}

class EngineeringStudent extends Student{
	EngineeringStudent(String name , int marks){
		super(name , marks);
		
	}
}

class MedicalStudent extends Student{
	MedicalStudent(String name , int marks){
		super(name , marks);
			}
}