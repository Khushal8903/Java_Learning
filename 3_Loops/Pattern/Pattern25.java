/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
import java.util.*;
public class Pattern25{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
		for(int i=1; i<=n;i++){
		int a=1;
			for(int j=1;j<=i*2-1; j++){
			    System.out.print(a+ " ");
				if(j<i){
					a++;
				}else{
					a--;
				}	
			
			}
			System.out.println();
		}
		}}