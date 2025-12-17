/* Write a menu-driven program using do-while and switch-case to:
Check if a number is prime.
Find the sum of digits of a number.
Reverse a number.
Exit.
Perform operations repeatedly until the user selects exit.
*/
import java.util.*;
public class Menu2{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	int ch=0;
	do{
		System.out.println("\n------ Operation Menu ------");
            System.out.println("1. Check if Number is Prime");
            System.out.println("2. Find the sum of digits of a number.");
            System.out.println("3. Reverse a number.");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

	switch(ch){
	    case 1:
			System.out.printf("Enter the number:");
			int num = sc.nextInt();
			int i=2;
			boolean b=false;
			while(i<(num-1)){
				if(num%i==0){
				    b=true;
					break;
				}else{
				 b=false;
				}
				
				i++;
			}
			String str = b?"Not Prime Number" : "Prime Number";
				System.out.print(str);
			break;
		case 2:
			System.out.print("Enter the number");
			int num1 = sc.nextInt();
			int sum=0;
			do{
			  sum+=	num1%10;
			  num1=num1/10;
			  	
			}
			while(num1!=0);	
			System.out.printf("Sum of the Number:%d",sum);			
			 break;
		case 3:
		System.out.print("Enter the number");
			int num2 = sc.nextInt();
			int rev=0;
			do{
				rev = rev*10 + num2%10;
				num2=num2/10;
				
			}while(num2!=0);
			System.out.printf("Reverse number: %d", rev);
				break;
		case 4:
			
			break;
		default:
			System.out.printf("Invalid Input");
	}
	}
		while(ch!=4);
	}
	
	}
