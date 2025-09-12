/*
Enter the number of row:4
   ****
  ****
 ****
****
*/
import java.util.*;
public class Pattern41{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of row:");
	int n = sc.nextInt();
	for(int i=1; i<=n; i++){
		for(int j=1; j<=n+3;j++){
		if(j>n-i && j<=(n+4)-i){
				System.out.print("*");
		}else{
				System.out.print(" ");
		}
		}
		System.out.println();
	}
	}
}