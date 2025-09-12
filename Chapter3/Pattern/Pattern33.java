/*
*
*1*
*121*
*12321*
*121*
*1*
*

*/

import java.util.*;
public class Pattern33{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of row");
	int n = sc.nextInt();
	int a=1;
	for(int i=1; i<=n;i++){
			
		for(int j=1; j<=a;j++){	
				if(j==1 || j==a){
					System.out.print("*");
			    }else {
					int num = j <= a / 2 ? j - 1 : a - j;
                    System.out.print(num);
				   
					
				}
				
			}
				System.out.println();
		
		if(i<(n+1)/2){
			a+=2;
		}else{
			a-=2;	
	 }

	}
	}
}