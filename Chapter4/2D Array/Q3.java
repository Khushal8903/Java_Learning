//Q3.WAP to create matrix of 3 x 3 and transpose it means convert row to column and column to row
import java.util.*;
public class Q3{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[][] = new int[3][3];
	
	System.out.print("Enter the value of the Matrix:");
	
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ;j++){
			a[i][j] = sc.nextInt();
		}
	}
	
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ;j++){
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
	
	}
}