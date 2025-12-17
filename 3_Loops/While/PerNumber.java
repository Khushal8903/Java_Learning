//perfect number
import java.util.*;
public class PerNumber{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number");
	int num = sc.nextInt();
	int i=1 , sum = 0;
	while(i <= num/2){
	  if(num%i ==0){
		sum = sum+i;
	  }
	  i++;
	}
	if(sum == num){
		System.out.printf("Perfect Number");
	}else{
	System.out.printf("Not Perfect Number");}
	}
}