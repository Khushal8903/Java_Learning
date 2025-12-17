/*
3. Person Age Verification
Task:
 Create a Person class with fields: name and age.
 In the main method:
Create a Person object.
Check if the person is eligible to vote (age >= 18) and print the result.
Explanation:
 This demonstrates condition checking using instance variables.
*/
import java.util.*;
class Person{
		private String name;
		private int age;
		
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}

public class  PersonAgeVerification{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no. of person");
		int n= sc.nextInt();
		sc.nextLine();
		
		Person p[] = new Person[n];
		
		for(int i=0 ; i<p.length; i++){
			p[i]=new Person();
			
			System.out.print("Enter the Name of the Person:");
			String s = sc.nextLine();
			
			p[i].setName(s);
			
			System.out.print("Enter the Age of the Person:");
			int a = sc.nextInt();
			sc.nextLine();
			p[i].setAge(a);
			
			
				
		}
		System.out.println("This person are Eligible for the Vote:");
		
		for(int i=0 ;i<p.length ; i++){
			if(p[i].getAge()>=18){
				System.out.println();
				System.out.println(p[i].getName());
			}
		}
		
	}
}