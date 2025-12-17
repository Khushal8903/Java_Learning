/*
Q2. Write a menu driven program in java to Create a class name as Employee to hold empid, empname , empemail , empcontact and empsalry.
			
The menu options should be: 
		
	1. Add Employee Details.
	2. Display All Employee Details.
	3. Search Employee By Id then employee is found or not.
	4. Update Employee Details By Name.
	5. Delete Employee Details By Email.
	6. Display list count of the Employee in Company.
	7. Display list the employee in the ascending order of employee salary.
	8. Display the employee details in highest salary.
	9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.
	10. Exit.
*/
import java.util.*;

class Employee{
	private int empid;
	private String empname;
	private String empemail;
	private int empsalry;
	private int empcontact;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public int getEmpsalry() {
		return empsalry;
	}
	public void setEmpsalry(int empsalry) {
		this.empsalry = empsalry;
	}
	public int getEmpcontact() {
		return empcontact;
	}
	public void setEmpcontact(int empcontact) {
		this.empcontact = empcontact;
	}
	
}

public class EmployeeApp01{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		Employee e[] = new Employee[100];
		int n = 0;
		
		do{
		System.out.println("1. Add Employee Details.\n"
							+ "2. Display All Employee Details.\n"
							+ "3. Search Employee By Id then employee is found or not.\n"
				 			+ "4. Update Employee Details By Name.\n"
							+ "5. Delete Employee Details By Email.\n"
							+ "6. Display list count of the Employee in Company.\n"
							+ "7. Display list the employee in the ascending order of employee salary.\n"
							+ "8. Display the employee details in highest salary.\n"
							+ "9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.\n"
							+ "10. Exit.\n");
							
		System.out.println("Enter the Choice:");
		int ch = sc.nextInt();
		switch(ch){
				case 1:
					System.out.println("Enter the no. of employee to add");
					int addcount = sc.nextInt();
					System.out.println("Enter the Employee Data(empid, empname , empemail , empcontact and empsalry)");
					for(int i=0 ; i<addcount ;i++){
						e[n] = new Employee();
						e[n].setEmpid(sc.nextInt());
						e[n].setEmpname(sc.next());
						e[n].setEmpemail(sc.next());
						e[n].setEmpcontact(sc.nextInt());
						e[n].setEmpsalry(sc.nextInt());
						n++;
					}
					break;
				case 2:
				System.out.println("Empid \t Empname \t Empemail \t Empcontact \t Empsalry");
					System.out.println("----------------------------------------------------");
                    for (int i = 0; i < n; i++) {
                        System.out.println(e[i].getEmpid() + "\t" + e[i].getEmpname() + "\t" + e[i].getEmpemail()
                                + "\t" + e[i].getEmpcontact()+"\t"+e[i].getEmpsalry());
                    }
                    break;
				case 3:
					System.out.println("Enter the Employee Id for Searching:");
					int id = sc.nextInt();
					boolean fId = false;
					System.out.println("Empid \t Empname \t Empemail \t Empcontact \t Empsalry");
					System.out.println("----------------------------------------------------");
                    for (int i = 0; i < n; i++) {
                        if(id == e[i].getEmpid()){
							 System.out.println(e[i].getEmpid() + "\t" + e[i].getEmpname() + "\t" + e[i].getEmpemail()
                                + "\t" + e[i].getEmpcontact()+"\t"+e[i].getEmpsalry());
								fId = true;
						}
                    }
					if(!fId){
						System.out.println("Employee not found of this Id");
					}
					break;
				case 4:
					System.out.println("Enter the Employee Name for Searching:");
					String name = sc.next();
					boolean fName= false;
					for(int i=0 ; i<n ;i++){
						if(name.equals(e[i].getEmpname()) ){
							System.out.println(e[i].getEmpid() + "\t" + e[i].getEmpname() + "\t" + e[i].getEmpemail()
                                + "\t" + e[i].getEmpcontact()+"\t"+e[i].getEmpsalry());
								fName = true;
						}
					}
					if(!fName){
						System.out.println("Employee not found of this Name");
					}
					break;
					
				case 5:
					System.out.println("Enter the Employee Email for deleting the data:");
					String email = sc.next();
					boolean fEmail = false;
					for(int i=0 ; i<n ; i++){
						if(email.equals(e[i].getEmpemail())){
							for(int j=i ; j<n-1 ; j++){
								e[j] = e[j+1];
								
							}
							n--;
							i--;
							fEmail = true;
						}
					}
					if(!fEmail){
						System.out.println("Employee not found of this Email");
					}else{
						System.out.println("Employee data Deleted");

					}
					break;
				case 6:
					System.out.println("Total no. of Employee: "+ n);
					break;
				case 7:
					for(int i=0 ; i<n-1 ; i++){
						for(int j=0 ; j<n-i-1 ; j++){
							if(e[j].getEmpsalry() > e[j+1].getEmpsalry()){
								Employee temp = e[j];
								e[j]=e[j+1];
								e[j+1] = temp;
								
							}
						}
					}
					System.out.println("Employee data sorted by salary");
					break;
				case 8:
				int hSal = 0,ip=0 ;
				System.out.println("Empid \t Empname \t Empemail \t Empcontact \t Empsalry");
					System.out.println("----------------------------------------------------");

					for(int i=0 ; i<n ;i++){
						if(e[i].getEmpsalry() > hSal){
							hSal = e[i].getEmpsalry();
							ip = i;
						}
					}
					System.out.println(e[ip].getEmpid() + "\t" + e[ip].getEmpname() + "\t" + e[ip].getEmpemail()
                                + "\t" + e[ip].getEmpcontact()+"\t"+e[ip].getEmpsalry());
					break;
				case 9:
					System.out.println("Enter the Min and Max salary range for the searching Employee:");
					int min = sc.nextInt();
					int max = sc.nextInt();
					boolean fs = false;
					System.out.println("Empid \t Empname \t Empemail \t Empcontact \t Empsalry");
					System.out.println("----------------------------------------------------");

					for(int i=0 ; i<n ; i++){
						if(e[i].getEmpsalry()>=min && e[i].getEmpsalry() <= max){
							System.out.println(e[i].getEmpid() + "\t" + e[i].getEmpname() + "\t" + e[i].getEmpemail()
                                + "\t" + e[i].getEmpcontact()+"\t"+e[i].getEmpsalry());
							fs = true;
						}
					}
					if(!fs){
						System.out.println("No Employee Are found between this range");
					}
					break;
				case 10:
					System.out.println("-----------Thank You----------");
					return;
								
		}
		
		}while(true);
	}
}