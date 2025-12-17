/*
0        1
01      01
010    101
0101  0101
0101010101
*/
import java.util.*;
public class Pattern44{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of row:");
	int n= sc.nextInt();
	int num=1;
	for(int i=1 ; i<=n;i++){
		for(int j=1 ; j<=n+n;j++){
		if(j<=i || j>10-i){
			if(j%2==0){
				System.out.print("1");
			}else{
				System.out.print("0");
			}
			
		}else{
			System.out.print(" ");
		}
		
		}
		System.out.println();
	}
	}
}