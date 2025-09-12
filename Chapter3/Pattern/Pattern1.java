/*
1234
1234
1234
1234

*/

import java.util.*;
public class Pattern1{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
		for(int i=1; i<=n;i++){
			for(int j=1;j<=n; j++){
			  System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}