/*
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/

import java.util.*;
public class Pattern28{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	//System.out.print("Enter the number of row:");
	//int n = sc.nextInt();
	for(int i=1 ; i<=9 ; i++){
		for(int j=1; j<=5;j++){
			if(j>5-i&&i<6){
			   System.out.print("*"+" ");
			}else if (j>i-5&&i>5){
				System.out.print("*"+" ");
			}else{
			System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	

}}