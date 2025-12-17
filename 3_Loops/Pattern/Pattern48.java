/*
Enter the number of row:5
A
B A B
C B A B C
D C B A B C D
E D C B A B C D E
*/
import java.util.*;
public class Pattern48{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of row:");
	int n= sc.nextInt();
	
	for(int i=1 ; i<=n;i++){
		int a=64	;
	  for(int j=1; j<=(i+i)-1; j++){
		System.out.print( (char)(a+i) + " " );
		if(j<i){
			a--;
		}else{
			a++;
		}
	  }
		System.out.println();
	}
	}
}