/*
    *
   * *
  * * *
 * * * *
* * * * *

*/
import java.util.*;
public class Patterm21{
	public static void main(String x[]){
	Scanner sc= new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
	for(int i = 1 ; i<=n; i++){
		for(int j = i ; j<=n-1 ; j++){
		    System.out.printf(" ");
		}
		
		for(int j = 1 ; j<=i ; j++){
		    System.out.printf("* ");
		}
		System.out.println();
	}
	
	}
}