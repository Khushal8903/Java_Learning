/*
Enter the number of row:5
A
B C
D E F
G H I J
K L M N O
*/
import java.util.*;
public class Pattern47{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of row:");
	int n= sc.nextInt();
	int a=65	;
	for(int i=1 ; i<=n;i++){
	  for(int j=1; j<=i; j++){
		System.out.print((char)a+ " " );
		a++;
	  }
		System.out.println();
	}
	}
}