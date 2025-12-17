/*
1
12
1 3
1  4
12345
*/

import java.util.*;
public class Pattern18{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
		for(int i=1; i<=n;i++){
			for(int j=1;j<=i; j++){
				if(i==1 ||j==1 ||i ==5||j==i){
					System.out.print(j);
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}