/*
Q1. Online Payment System – Using Interface
Interface: Payment
Methods:
processPayment(double amount)
getCharges()
Classes Implementing Interface:
UPI – No extra charges
CreditCard – 2% processing fee
DebitCard – 1% processing fee

Task:
Take 5 payments (mix of UPI, credit, debit).
Print final amount after adding charges.
Count how many payments used CreditCard.

Explanation:
This question checks:
How class implements an interface
Polymorphism using interface reference
Logic to add percentage charges
Filtering and counting items
*/
import java.util.*;

interface Payment{
	void processPayment(double amount);
	
	double getCharges(double amount);
}

class UPI implements Payment {
     void processPayment(double amount) {
        System.out.println("UPI Payment processed: " + amount);
    }

    public double getCharges(double amount) {
        return 0;   
    }
}
class CreditCard implements Payment{
	public void processPayment(double amount){
		System.out.println("Credit Card Payment processed: " + amount);
	}
	public double getCharges(double amount){
		return amount*0.02;
	}
}
class DebitCard implements Payment{
	public void processPayment(double amount){
		System.out.println("Debit Card Payment processed: "+ amount);
	}
	public double getCharges(double amount){
		return amount*0.01;
	}
}

public class OnlinePaymentSystem{
	public static void main(String x[]){

	Scanner sc = new Scanner(System.in);
	
	
	Payment p[] = new Payment[5];
	double amount[] = new double[5];
	
	for(int i=0 ; i<p.length ; i++){
		System.out.println("Enter the Payment Mode : 1.UPI  2.CreditCard  3.DebitCard :");
			int pMode = sc.nextInt();
		
		System.out.println("Enter the Amount:");
			double amt = sc.nextDouble(); 
			amount[i] =amt;
			
	switch(pMode){
		case 1:
			p[i] = new UPI();
			break;
		case 2:
			p[i] = new CreditCard();
			break;
		case 3:
			p[i]=new DebitCard();
			break;
		default :
			System.out.println("Enter the Valid Input:");
			i--;
	}	
		
			
	}
	OnlinePaymentSystem op = new OnlinePaymentSystem();
	
	System.out.println("Total Revenue :" + op.getFinalAmount(p , amount));
	System.out.println("---------------------------------------------------------");

	op.getCreditCardCount(p);
		
		
	}
	
	public double getFinalAmount(Payment p[] , double a[]){
		double revenue=0;
		for(int i=0 ; i<p.length ; i++){
			double charge = p[i].getCharges(a[i]);
			double finalamt = a[i]+charge;
			
			p[i].processPayment(finalamt);
			
			System.out.println("Amount :" +a[i]+ "\nCharges :"+charge+ "\nTotal Amount :"+ finalamt);
			System.out.println();
			revenue = revenue+finalamt;
		}
		System.out.println("---------------------------------------------------------");

		return revenue;
	}
	
	public void getCreditCardCount(Payment []p){
	int ccnt = 0 ;
		for(Payment k : p){
		if(k instanceof CreditCard) ccnt++;
	}
	System.out.println("Total credit card user are :"+ ccnt);
	}
	
}
