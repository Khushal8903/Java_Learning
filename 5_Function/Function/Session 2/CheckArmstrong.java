//Write a function to check if a number is an Armstrong number.
import java.util.*;
public class CheckArmstrong{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	int sum = isArmstrong(num);
	if(sum==num){
		System.out.print("Armstrong");
	}else{
		System.out.print("Not Armstrong");
	}
	
	}
	
	public static int isArmstrong(int a){
		int temp = a;
		int num=a;
		int count=0,sum=0;
		while(temp!=0){
			count++;
			temp = temp/10;
		}
		
		while(a!=0){
			int rem = a%10;
			int pow =(int)Math.pow(rem , count);
			sum = sum+pow;
			a/=10;
		}
		return sum;
	}
	
}