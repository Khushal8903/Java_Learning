/*
*
**
***
****
*/
import java.util.*;
public class Pattern8{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
		for(int i=1; i<=n;i++){
			for(int j=1;j<=n; j++){
				if(i >=j){
				System.out.print("*");
				}else{
					System.out.printf(" ");
				}
			}
			System.out.print("\n");
		}
	}
}