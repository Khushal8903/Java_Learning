/*
*
*
*
*
*****
*/
import java.util.*;
public class Pattern3{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
		for(int i=1; i<=n;i++){
			for(int j=1;j<=n; j++){
				if(i==5 || j==1){
			  System.out.print("*");}
			}
			System.out.print("\n");
		}
	}
}