/*
12345
2  5
3 5
45
5
*/import java.util.*;
public class Pattern23{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
	int a=n;
	for(int i =1; i<=n;i++){
		for(int j =1;j<=a;j++){
			if(j==1){
				System.out.print(i);
			}else if(i==1){
				System.out.print(j);
			}else if(j==a){
				System.out.print("5");
			}else{
				System.out.print(" ");
			}
			
		}
		--a;
		System.out.println();
		
	}
	}
	}
