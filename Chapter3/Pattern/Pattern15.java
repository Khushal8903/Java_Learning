/*
Hollow Inverted Half Pyramid
******
*   *
*  *
* *
**
*
*/
import java.util.*;
public class Pattern15{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
		for(int i=1; i<=n;i++){
			for(int j=1;j<=(n+1)-i; j++){
				if(i==1 || j==1 || j==(n+1)-i){
			  System.out.print("*" );
				}else{
				System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}