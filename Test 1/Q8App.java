/* Q8. Write a java program to find the total number of notes in a given 
amount.   
Enter the amount: 2528  
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1
*/
import java.util.*;
public class Q8App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Amount:");
	int Amt = sc.nextInt();
	int R500 , R100 , R50 , R20 , R10 , R5 , R2 , R1;
	
	if(Amt >= 500){
	    R500 = Amt/500;
		System.out.printf("500 = %d\n " , R500);
		Amt = Amt - 500*R500;
	} if(Amt >= 100){
		R100 = Amt/100;
		System.out.printf("100 = %d\n " , R100);
		Amt = Amt - 100*R100;
	} if(Amt >= 50){
		R50 = Amt/50;
		System.out.printf("50 = %d\n " , R50);
		Amt = Amt - 50*R50;
	} if(Amt >= 20){
		R20 = Amt/20;
		System.out.printf("20 = %d\n " , R20);
		Amt = Amt - 20*R20;
	} if(Amt >=10){
		R10 = Amt/10;
		System.out.printf("10 = %d\n " , R10);
		Amt = Amt - 10*R10;
	} if(Amt >= 5){
		R5 = Amt/5;
		System.out.printf("5 = %d\n " , R5);
		Amt = Amt - 5*R5;
	} if(Amt >= 2){
		R2 = Amt/2;
		System.out.printf("2 = %d\n " , R2);
		Amt = Amt - 2*R2;
	}else{
		R1 = Amt/1;
		System.out.printf("1 = %d\n " , R1);
		Amt = Amt - 1*R1;
	}
	}
}