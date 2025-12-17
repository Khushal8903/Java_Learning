/*
Q3. Library Fine Calculation – Interface with Rules
Interface: FineCalculator
Method:
calculateFine(int daysLate)
Implementing Classes:
Book
Fine = ₹2 × daysLate
Magazine
Fine = ₹3 × daysLate
ResearchPaper
Fine = ₹5 × daysLate
If daysLate > 10 → add extra ₹50
Task:
Accept 8 items (mix of all types).
Calculate fine and print details.
Find total fine collected.
Explanation:
Covers:
Interface method overriding
Logical conditions inside implementing classes
Summation of results
Mixing different classes via interface reference
*/

import java.util.*;

interface FineCalculator{
	
	public int calculateFine(int daysLate);
}

class Book implements FineCalculator{
	public int calculateFine(int daysLate){
		return 2*daysLate;
	}
}
class Magazine implements FineCalculator{
	public int calculateFine(int daysLate){
		return 3*daysLate;
	}

}
class ResearchPaper implements FineCalculator{
	public int calculateFine(int daysLate){
		if (daysLate > 10) {
			return 5*daysLate+50;
		}
		return 5*daysLate;
	}

}

public class LibraryFineCalculation{
	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	
	FineCalculator fc[] = new FineCalculator[5];
	
	int ld[] = new int[5];
	
	for(int i=0 ; i<fc.length ; i++){
	
		System.out.println("Enter the Type or reading material: 1.Book  2.Magazine  3.ResearchPaper");
		int type =sc.nextInt();
		
		System.out.println("Enter the Late Day:");
		int ld1 = sc.nextInt();
		
		switch(type){
		case 1:
			fc[i]=new Book();
			ld[i]=ld1;
			break;
		case 2:
			fc[i]=new Magazine();
			ld[i]=ld1;
			break;
		case 3:
			fc[i]=new ResearchPaper();
			ld[i]=ld1;
			break;
		default:
			System.out.println("Invalid Input");
			i--;
		}
	
	}
	LibraryFineCalculation LC = new LibraryFineCalculation();
	LC.printFine(ld , fc);
	System.out.println("---------------------------------------------------------------------------");

	System.out.println("Total :"+ LC.totalFine(ld , fc));

	}
	public void printFine(int ld[] , FineCalculator fc[]){
		System.out.println("Detail in tabular form");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(" Type \t\t\t Late Day \t\t Fine");
		System.out.println("---------------------------------------------------------------------------");
		for(int i=0 ; i<fc.length;i++){
		System.out.println(fc[i].getClass().getSimpleName() +"\t\t\t"+ld[i]+"\t\t"+fc[i].calculateFine(ld[i]) );
		}
	}
	
	public int totalFine(int ld[] , FineCalculator fc[]){
		int total=0;
		for(int i=0 ; i <fc.length; i++){
			total=total + fc[i].calculateFine(ld[i]);
		}
		return total;
	
}
}