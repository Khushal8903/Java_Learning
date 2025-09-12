//find the power of the nubmer using the recursion 
import java.util.*;
public class powerusingrecursion{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the base number:");
	int base = sc.nextInt();
	System.out.print("Enter the index number:");
	int idx = sc.nextInt();
	
	int pow =getPow(base , idx );
	System.out.print(pow);
	}
	
	public static int getPow(int b, int i){
		
		if(i<=0){
			return 1;
		}else
			return b * getPow(b , i-1);
		
	}
} 