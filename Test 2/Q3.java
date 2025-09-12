/*
  Q3. Write a java program to print this pattern. 
 
1 
2 * 2 
3 * 3 * 3 
4 * 4 * 4 * 4 
3 * 3 * 3 
2 * 2 
1 

*/

import java.util.*;
public class Q3{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
		for(int i=1; i<=7 ;i++){
			for(int j=1 ; j<=i ;j++){
				if(i<=4){
					if( j==i){
					System.out.print(i);
					}else{
						System.out.print(i+"*");
					}
				}else {
					if(j==8-i){
					System.out.print(8-i);
					}else if(j<8-i){
						System.out.print(8-i+"*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
			
			
		
	
	}

}





/*
if(i<=4){
			for(int j=1;j<=i ;j++){
				if(j==i){
					System.out.print(i);
				}else{
				System.out.print(i+ "*");
			}}
			}else{
				for(int j=1;j<=8-i ;j++){
				if(j==8-i){
					System.out.print(8-i);
				}else{
				System.out.print(8-i+ "*");
				}
				}	
			}
			*/