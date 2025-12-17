//Q38. Write a java program to find HCF (GCD) of two numbers.
import java.util.*;
public class HCFApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number 1st number:");
	int num1 = sc.nextInt();
	System.out.printf("Enter the number 2nd number:");
	int num2 = sc.nextInt();
	int hcf =1;
	int minnum = num1 >num2 ? num2 : num1 ;
	
	for(int i=1 ; i <= minnum ; i++){
		
		if(num1%i==0 && num2%i==0){
			hcf = i;
		}
	    
	}
	   System.out.println(hcf);
}}

//

while(a%b !=0){
   rem = a%b;
   a=b;
   b =rem;
}