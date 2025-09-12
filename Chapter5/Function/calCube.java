//calculate cube;
import java.util.*;
public class calCube{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	
	calCube cc = new calCube();
	int res = cc.calCube(num);
	System.out.print("res="+ res);
	
	}
	
	public int calCube(int n){
		int res = n*n*n;
		return res;
	}
}