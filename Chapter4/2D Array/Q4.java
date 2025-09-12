//Q4. WAP to create two matrix of 3 x 3 and perform matrix multiple on two matrix and store its result in 3rd matrix
import java.util.*;
public class Q4{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the value of first matrix:");
	int a[][] = new int[3][3];
	for(int i=0 ; i<a.length ;i++){
		for(int j=0 ; j<a[i].length ;j++){
			a[i][j] = sc.nextInt();
		}
	}
	System.out.print("Enter the value of first matrix:");
	int b[][] = new int[3][3];
	for(int i=0 ; i<b.length ;i++){
		for(int j=0 ; j<b[i].length ;j++){
			b[i][j] = sc.nextInt();
			
		}
	}
	
	int c[][] = new int[3][3];
	int sum=0;
	for(int i=0 ; i<c.length ; i++){
		for(int j=0 ; j<c[i].length;j++){
			sum=0;
			for(int k=0 ; k<c[i].length;k++){
				sum = sum+ a[i][k]*b[k][j];
			}
			c[i][j] = sum;
		}
	}
	for(int i=0 ; i<c.length ;i++){
		for(int j=0 ; j<c[i].length ;j++){
			System.out.print(c[i][j]+" ");
			
		}
		System.out.println();
	}
	}
}