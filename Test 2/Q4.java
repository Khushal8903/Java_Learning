/*
 Q4. Write a java program to print this pattern. 
 
      * 
    * * * 
   *  *  * 
  *   *   * 
 ********* 
  *   *   * 
   *  *  * 
    * * * 
     *
*/
import java.util.*;
public class Q4{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
		for(int i=0; i<9 ;i++){
			for(int j=1 ; j<=9 ;j++){
				if((i<=4)&&(j==5 || i==4 || j==5-i || j==5+i)){
						System.out.print("*");
				}else if((i>4)&&(j==5 || j==i-3 || j==13-i)){
						System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}
}