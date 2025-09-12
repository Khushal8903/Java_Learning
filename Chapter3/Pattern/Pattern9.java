/*
1234
 234
  34
   4
*/

import java.util.*;
public class Pattern9{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
		for(int i=1; i<=n;i++){
			for(int j=1;j<=n; j++){
				if(j>=i){
			  System.out.print(j);
			  }else{
			  System.out.printf(" ");
			  }
			}
			System.out.print("\n");
		}
	}
}