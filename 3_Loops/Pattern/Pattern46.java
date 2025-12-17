/*
Enter the number of row:5
123454321
1234321
12321
121
1
*/
import java.util.*;
public class Pattern46{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of row:");
	int n= sc.nextInt();
	int a=n+(n-1);
	for(int i=1 ; i<=n;i++){
	  int num=1;
	  
		for(int j=1 ; j<=a;j++){
			System.out.print(num);
		if(j<=(a/2)){
			num++;
		}else{
			num--;
			
			
		}
		}
		a-=2;
		System.out.println();
	}
	}
}