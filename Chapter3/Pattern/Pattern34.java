/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
*/
import java.util.*;
public class Pattern34{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no.  of row:");
	int n = sc.nextInt();
	for(int i=0; i<n; i++){
	int num=1;
		for(int j=0; j<=i;j++){
			 System.out.print(num+ " ");
		   num = num*(i-j)/(j+1);
		}
	   System.out.println();
	}
	}
}
