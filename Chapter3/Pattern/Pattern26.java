/*
A
A B A
A B C B A
A B C D C B A
A B C D E D C B A
*/
import java.util.*;
public class Pattern26{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
		for(int i=1; i<=n;i++){
		int a=65;
			for(int j=1;j<=i*2-1; j++){
			    System.out.printf("%c ", (char)a);
				if(j<i){
					a++;
				}else{
					a--;
				}	
			
			}
			System.out.println();
		}
		}}