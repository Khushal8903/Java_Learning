/*
Enter the number of row:10
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
*/
import java.util.*;
public class Pattern36{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of row:");
	int n = sc.nextInt();
	for(int i=1; i<=n;i++){
		for(int j=1;j<=n;j++){
			if((i<=n/2 && j<=i) || (i<=n/2 && j>=(n+1)-i)){
				System.out.print("*");
			}else if((i>n/2 && j<=(n+1)-i )||(i>n/2 && j>=i)){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	}
}