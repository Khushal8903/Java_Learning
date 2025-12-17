//Q1. WAP to create two matrix of 3 x3  and calculate addition of two matrix and store in third matrix
import java.util.*;
public class Q1{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the value of first matrix:");
	int a[][] = new int[3][3];
	for(int i=0 ; i<a.length ;i++){
		for(int j=0 ; j<a[i].length ;j++){
			a[i][j] = sc.nextInt();
		}
	}
	
	System.out.print("Enter the value of second matrix:");
	int b[][] = new int[3][3];
	for(int i=0 ; i<b.length ;i++){
		for(int j=0 ; j<b[i].length ;j++){
			b[i][j] = sc.nextInt();
		}
	}
	
	int c[][] = new int[3][3];
	
	for(int i=0 ; i<c.length ;i++){
		for(int j=0 ; j<c[i].length ;j++){
			c[i][j] =a[i][j]+b[i][j];
		}
	}
	
	System.out.println("Sum of the Two Matrix:");
	
	for(int i=0 ; i<c.length ;i++){
		for(int j=0 ; j<c[i].length ;j++){
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	
	}
}