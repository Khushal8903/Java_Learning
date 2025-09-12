//WAP to create 3 x 3 matrix and calculate sum of column
import java.util.*;
public class CalSumofColumn{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[][]=new int[3][3];

	System.out.print("Enter the Input:");
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ;  j++){
			a[i][j]= sc.nextInt();
		}
	}
	
	for(int i=0 ; i<a.length ; i++){
		int sum=0;
		for(int j=0 ; j<a[i].length ; j++){
			System.out.print(a[i][j]+ " ");
			sum = sum+a[i][j];
		}
		
		System.out.println("= " + sum );
		
	}
	}
}