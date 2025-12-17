import java.util.*;
public class StarPrintingUsingRec{
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	StarPrintingUsingRec s = new StarPrintingUsingRec();
	System.out.print("Enter the number of row:");
	int r = sc.nextInt();
	System.out.print("Enter the number of col:");
	int c = sc.nextInt();
	s.printStar(r ,c ,c);
	
	}
	
	void printStar(int row , int col , int col1){
	
		if(col == 0){
			System.out.println();
			col = col1;
			row--;
		}
		
		
		if(row == 0){
			return;
		}else{
			System.out.print("*");
		printStar(row , --col , col1);
		}
	}
}