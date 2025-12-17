/*
Enter the number of row:10
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/
import java.util.*;
public class Pattern35{
	public static void main(String x[]){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the number of row:");
	int n = sc.nextInt();
	for(int i=1 ; i<=n; i++){
		for(int j=1; j<=n; j++){
		
		if(i<=5 && j<=6-i|| j>4+i){
		   System.out.printf("*");
		}else if(i>=5&& j<=i-5 || j>15-i){
			System.out.printf("*");
		}else{
			System.out.printf(" ");
		}
		}
		System.out.println();
	}
	}
}