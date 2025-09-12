/*

*****
****
***
**
*

*/

import java.util.*;
public class Pattern5{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
	int k=n;
		for(int i=1; i<=n;i++){
			for(int j=1;j<=k; j++){
			  System.out.print("*");
			}
			--k;
			System.out.print("\n");
		}
	}
}