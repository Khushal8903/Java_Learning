/*
*******
**   **
* * * *
*  *  *
* * * *
**   **
*******
*/
import java.util.*;
public class  Pattern37{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number of row:");
	int n= sc.nextInt();
	for(int i=1;i<=n;i++){
		for(int j=1 ; j<=n; j++){
		if(i==1 || i==n || j==1 || j==n || j==8-i || j==i){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		}
		System.out.println();
	}
	}
}