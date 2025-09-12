/*
ABCDE
abcd
ABC
ab
A
*/
import java.util.*;
public class Pattern10{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
		for(int i=1; i<=n;i++){
			int a = 65 ;
			for(int j=1;j<=n; j++){
			
				if(j>=i){
					if(i%2==0){
						
						System.out.printf("%c" , (char)a+32 );
						
						}else{
						System.out.printf("%c" , (char)a );
						
						}
						a++;
			  }
			}
			System.out.print("\n");
		}
	}
}