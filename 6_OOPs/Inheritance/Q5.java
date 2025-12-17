/*
5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.


For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.


Explanation:
 This tests inheritance with percentage-based calculations in subclasses.
*/
import java.util.*;
public class Q5{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("Sal: ");
	int sal = sc.nextInt();
	sc.nextLine();
	
	System.out.print("Name: ");
	String name1 = sc.nextLine();
	System.out.print("sal: ");
	int sal1 = sc.nextInt();
	Staff s = new TeachingStaff(name , sal);
	System.out.println("Name: "+s.getName());
	System.out.println("Sal: "+s.incSal());
	
	s = new NonTeachingStaff(name1 , sal1);
	System.out.println("Name: "+s.getName());
	System.out.println("Sal: "+s.incSal());

	
	}
}
class Staff{
	private String name;
	protected int sal;
	
	Staff(String name , int sal){
		this.name=name;
		this.sal=sal;
	}
	public String getName(){
		return name;
	}
	double incSal(){
		return sal; 
	} 

}

class TeachingStaff extends Staff{
	TeachingStaff(String name , int sal){
		super(name , sal);
	}
	double incSal(){
		return sal+sal*0.15; 
	} 

	

}

class NonTeachingStaff extends Staff{
	NonTeachingStaff(String name , int sal){
		super(name , sal);
	}
	
	double incSal(){
			return sal+sal*0.10; 
		} 

}