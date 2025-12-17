import java.util.*;
public class Pattern24{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
		for(int i=1; i<=n;i++){
		int a=i;
			for(int j=1;j<=n+3; j++){
					
					if(j>=(n+1)-i && j<=(n-1)+i){
					   if(j<=4){
					       System.out.print(a);
						   a++;
						   
					   }else{
						   
					       --a;
						   System.out.print(a);
					   }
					}else{
						System.out.print(" ");
					}
			
			}
			System.out.println();
		}
		}}