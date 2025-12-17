import java.util.*;
public class StarPrintingUsingRec1{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	StarPrintingUsingRec1 s1 = new StarPrintingUsingRec1();
	System.out.print("Enter the number of row:");
	int r = sc.nextInt();
	System.out.print("Enter the number of col:");
	int c = sc.nextInt();
	int c1 = c;
	s1.printStar1(r ,c ,c1,0);
	
	}
	
	void printStar1(int row ,int col ,int col1 ,int count){
		
		if(row==0){
			return;
		}
		if(col == 0){
			System.out.println();
            printStar1(row - 1, col1, col1, 0);
            return;
		}
		if(row<=count){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		
		if(row!=0){
			printStar1(row, col - 1, col1, count + 1);
		}
	}
}



void helper(){
	System
	
}

void Recurrsion(int n){
	
	
	
}