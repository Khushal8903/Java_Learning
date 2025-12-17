/*
7. Student Grade Evaluation
Task:
 Create a Student class with fields: name, marks, and subject.
 In the main method:
Create a Student object.
Check if the student has passed or failed the subject (passing marks >= 40) and print the result.
Explanation:
 This task involves condition checking and field manipulation.
*/
import java.util.*;
class Student{
	private String name;
	private int marks;
	private String subject;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setMarks(int marks){
		this.marks = marks;
	}
	public int getMarks(){
		return marks;
	}
	public void setSubject(String subject){
		this.subject = subject;
	}
	public String getSubject(){
		return subject;
	}
}

public class StudentGradeEvaluation{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		Student st= new Student();
		
		System.out.print("Enter the name of the Student:");
		String s = sc.nextLine();
		st.setName(s);
		
		System.out.print("Enter the name of the Subject:");
		String sub = sc.nextLine();
		st.setSubject(sub);
		
		System.out.print("Enter the Marks in Subject:");
		int m = sc.nextInt();
		sc.nextLine();
		st.setMarks(m);
		
		
		if(st.getMarks() >= 40){
			System.out.print(st.getName()+" Passed in "+ st.getSubject());
		}
		}
}