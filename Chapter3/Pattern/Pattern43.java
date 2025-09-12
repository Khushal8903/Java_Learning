/*
Enter the number of row:4
   1
  2 3
 4 5 6
7 8 9 10
*/
import java.util.*;
public class Pattern43{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of row:");
	int n= sc.nextInt();
	int num=1;
	for(int i=1 ; i<=n;i++){
		for(int j=1 ; j<=n;j++){
		if(j<=4-i){
			System.out.print(" ");
		}else{
			System.out.print(num+ " ");
			num++;
		}
		
		}
		System.out.println();
	}
	}
}