//WAP to create two 3 x 3 matrix and perform its multiplication and store in third matrix
import java.util.*;
public class MultiplicationofMatrix{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the value of the First Matrix");
	int a[][] = new int[3][3];
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length; j++){
			a[i][j] = sc.nextInt();
		}
	}
	
	System.out.print("Enter the value of the Second Matrix");
	int b[][] = new int[3][3];
	for(int i=0 ; i<b.length ; i++){
		for(int j=0 ; j<b[i].length; j++){
			b[i][j] = sc.nextInt();
		}
	}
	int c[][] = new int [3][3];
	
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ;j++){
			int sum = 0;
			for(int k=0 ; k<a[i].length;k++){
				sum = sum + a[i][k]*b[k][j];
			}
			c[i][j] = sum;
			}
	}
	for(int i=0 ; i<c.length ; i++){
		for(int j=0 ; j<c[i].length; j++){
			System.out.print(c[i][j]+" ");
		}
	}
	}
}