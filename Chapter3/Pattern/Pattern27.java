/*
    1
   121
  12321
 1234321
123454321

*/
import java.util.*;
public class Pattern27{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number of row:");
	int n = sc.nextInt();
	
	
	for(int i=1; i<=n; i++){
	int b =1;
	for(int j =1; j<=n+i-1;j++){
		if(j<=n-i){
	  System.out.print(" ");
	    }else{
			System.out.print(b);
		if(j<n){
				b++;
			}else{
				b--;
			}
	}}
		System.out.println();
	}
	}
}