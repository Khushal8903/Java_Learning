/*
    *
   * *
  *   *
 *     *
*       *
*       *
 *     *
  *   *
   * *
    *
*/

import java.util.*;
public class Pattern29{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	//System.out.print("Enter the number of row:");
	//int n = sc.nextInt();
	for(int i=1 ; i<=10 ; i++){
		for(int j=1; j<=9;j++){
			if(j==6-i||j==5+i-1 &&i<6){
			   System.out.print("*");
			}else if (j==i-5||j==15-i&&i>5){
				System.out.print("*");
			}else{
			System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	

}}