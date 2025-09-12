//Print Multiplication table using Recursion Function
import java.util.*;
public class MulTable{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	int count=1;
	
	MulTable mt = new MulTable();
	mt.getTable(num , count);
	
	}
	
	public void getTable(int n, int count){
			
			if(count>10){
				System.out.print("End");
			}else{
			int m = n *count;
			System.out.println(m);
			getTable(n , ++count);
			}
	}
}