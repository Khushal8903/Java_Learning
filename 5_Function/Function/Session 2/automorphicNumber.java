//Write a function to check if a number is an automorphic number (last digits = square of number).
import java.util.*;
public class automorphicNumber{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	
	if(isAutomorphic(num)){
				System.out.print("Automorphic number ");
		}else{
				System.out.print("Not Automorphic number");
		}
	
	}
	
	
	public static boolean isAutomorphic(int n){
		
		int sq = n*n;
		if(n%10 == sq%10){
			return true;
		}
			return false;
	}

}