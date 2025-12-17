//Armstrong Number
import java.util.*;
public class ArmSApp{
	public static void main(String x[]){
	Scanner sc =new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int n = num  , a =0 , b , sum=0 ;
	while(num != 0){
	    num= num /10;
		a++;
	}
	num =n;
	while(num!=0){
		b = num%10;
		 n = num/10;
		 int p=1 , j=1;
		 while(j<=a){
			 p=p*b;
			 j++;
		 }
		  sum = sum+p;
	   }
	   String msg = n ==sum?"Armstrong":"Not Armstrong";
	   System.out.println(msg);

	}
}