/*
5. Company Profit Margin
Task:
 Create a Company class with fields: companyName, revenue, and expenses.
 In the main method:
Create a Company object.
Calculate the profit margin (profit/revenue) and display the result.
Explanation:
 This introduces basic mathematical operations and accessing object fields.
*/
import java.util.*;
class Company{
	private String compName;
	private int revenue;
	private int expenses;
	
	public void setCompanyName(String compName){
		this.compName=compName;
	}
	public String getCompanyName(){
		return compName;
	}
	public void setRevenue(int revenue){
		this.revenue = revenue;
	}
	public int getRevenue(){
		return revenue;
	}
	public void setExpenses(int expenses){
		this.expenses = expenses;
	}
	public int getExpenses(){
		return expenses;
	}
		
		
	
}

public class CompanyProfitMargin{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Company c = new Company();
	
	System.out.println("Enter the Name of the Company:");
	String s = sc.nextLine();
	c.setCompanyName(s);
	
	System.out.print("Enter the revenue of the Company:");
	int rev = sc.nextInt();
	sc.nextLine();
	c.setRevenue(rev);
	
	System.out.println("Enter the expenses of the Company:");
	int ex = sc.nextInt();
	sc.nextLine();
	c.setExpenses(ex);
	
	
	int profit = c.getRevenue() - c.getExpenses();
	
	double pm = (double)profit/c.getRevenue();
	
	System.out.println("Profit Margin of the Company:" + pm*100 +"%");

	}
}