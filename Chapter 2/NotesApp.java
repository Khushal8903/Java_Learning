/*
Q25.Write a java program to find the total number of notes in a given amount.  
                    	
            Enter the amount: 2528
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1
*/
import java.util.*;
public class NotesApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int R500 , R100 , R50 , R20, R10, R5 , R2 , R1;
	System.out.printf("Enter the Amount: \n");
	int amt  = sc.nextInt();
	if(amt >=500){
		 R500 = amt / 500;
		System.out.printf("500 = %d  \n" , R500);
		amt = amt - (R500*500);}
	     if(amt>=100){
			R100 = amt / 100;
			 System.out.printf("100 = %d\n" , R100);
			amt = amt - (R100*100);}
			if(amt>=50){
				R50 = amt / 50;
				 System.out.printf("50 = %d\n" , R50);
				amt = amt - (R50*50);}
				if(amt>20){
					R20 = amt / 20;
					 System.out.printf("20 = %d\n" , R20);
					amt = amt - (R20*20);}
					if(amt>=10){
						R10 = amt / 10;
						 System.out.printf("10 = %d\n" , R10);
						amt = amt - (R10*10);}
						if(amt>=5){
							R5 = amt / 5;
							 System.out.printf("5 = %d\n" , R5);
							amt = amt - (R5*5);}
							if(amt>=2){
								R2 = amt / 2;
								 System.out.printf("2 = %d\n" , R2);
								amt = amt - (R2*2);}
							if(amt>=1){
									R1 = amt / 1;
									 System.out.printf("1 = %d" , R1);
									 amt = amt - (R1*1);
									}else {
										System.out.printf("Invalid Input");
								    }
	
}}