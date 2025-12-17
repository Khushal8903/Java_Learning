/*
Q2. Problem:
 Create a class Student with fields rollNo, name, m1, m2, m3, and total.
 Use a parameterized constructor to assign values to roll number, name, and marks.
 Calculate total marks inside the constructor and display details using a function.
Hint: Constructor should perform addition logic.
Explanation:
 Shows how to use constructors to initialize and process multiple fields at once.
*/
import java.util.*;
public class Q2{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Name of the Student:");
			String name = sc.nextLine();
			System.out.println("Enter the Roll Numbeer of the Student:");
			int rl = sc.nextInt();
			System.out.println("Enter the three marks:");
			int m1=sc.nextInt();
			int m2=sc.nextInt();
			int m3=sc.nextInt();
			
			Student s = new Student(name , rl , m1 , m2 , m3);
			s.disp();
		}
}

class Student{
	private String name;
	private int rollNum;
	private int marks;
	
	
	Student(String name , int rollNum , int m1, int m2 , int m3){
			this.name=name;
			this.rollNum=rollNum;
			this.marks=m1+m2+m3;
	}

	public void disp(){
		System.out.println("Name: "+ name);
		System.out.println("Roll No.: "+ rollNum);
		System.out.println("Marks: "+ marks);
	}
}