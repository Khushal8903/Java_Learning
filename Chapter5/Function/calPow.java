// calculate power
import java.util.*;
public class calPow{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the base:");
	int b = sc.nextInt();
	System.out.print("Enter the Index:");
	int i = sc.nextInt();
	
	calPow cp = new calPow();
	int res = cp.calPow(b , i);
	
	System.out.print("Power : " + res);
	
	
	}
	
	public int calPow(int base , int index){
		int p=1;
		while(index!=0){
			p = p*base;
			index--;
		}
		
		return p;
	}
}