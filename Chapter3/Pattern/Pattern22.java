/*
    1
   1 2
  1   3
 1     4
1 2 3 4 5

*/

import java.util.*;
public class Pattern22{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number of row:");
	int n = sc.nextInt();
	int a=n;
	for(int i=1 ; i<=n ; i++){
		for(int j=1 ; j<=a; j++){
			if(j==n+1-i){
				System.out.print("1");
			}else if (j == a  && i != 1 && i != n) {
                    // Right side number (2,3,4)
                    System.out.print(i);
			}else if (i == n && j == 2) {
                    for(int k=2 ; k<=n;k++){
                    System.out.print(" " + k);
					}
			}else{
				System.out.print(" ");
			}
			
		}
		a++;
        System.out.println();
	}
	}
}