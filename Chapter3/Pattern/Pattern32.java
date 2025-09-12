/*
1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1
*/
import java.util.*;
public class Pattern32{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of row");
	int n = sc.nextInt();
	int count=0;
	for(int i=1; i<=n;i++){
	int a=i;
		if(i<=4){
		   count ++;
		   for(int j=1; j<=a; j++){
			if(j==1){
		 System.out.print(count);
		}else{
			System.out.print("*" +count);
		}
		}
		}else if(i>4){
		  
		  a=9-a;
		  for(int j=1; j<=a; j++){
			if(j==1){
		 System.out.print(count);
		}else{
			System.out.print("*" +count);
		}
		} count--;
		
		}
		
		System.out.println();
	}
	}
}