/*
    *
     *
      *
       *
*********
       *
      *
     *
    *
*/
import java.util.*;
public class  Pattern39{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number of row:");
	int n= sc.nextInt();
	for(int i=1;i<=n;i++){
		for(int j=1 ; j<=n; j++){
		if(i<=5 && i==5 || j==4+i){
			System.out.print("*");
		}else if(i>5&& j==14-i){
			System.out.print("*");
		}else{
		   System.out.print(" ");
		}
		}
		System.out.println();
	}
	}
}