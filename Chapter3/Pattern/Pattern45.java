/*
Enter the number of row:5
1        1
12      21
123    321
1234  4321
1234554321
*/
import java.util.*;
public class Pattern44{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of row:");
	int n= sc.nextInt();
	
	for(int i=1 ; i<=n;i++){
	  int num=1;
		for(int j=1 ; j<=n+n;j++){
		if(j<=i){
			System.out.print(num);
			num++;
		}else if(j>10-i){
			num--;
			System.out.print(num);
			
		}else{
			System.out.print(" ");
		}
		
		}
		System.out.println();
	}
	}
}