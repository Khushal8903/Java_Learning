//WAP to create two matrix of 3 x  3 and calculate its addition and store in third matrix 
import java.util.*;
public class AddofTwoMatrix{
	public static void main(String x[]){
	 Scanner sc = new Scanner(System.in);
	 
	int a[][]=new int[3][3];
	System.out.print("Enter the Value in first Matrix:");
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ; j++){
			a[i][j] = sc.nextInt();
		}
	}
	 
	int b[][]=new int[3][3];
	System.out.print("Enter the Value in first Matrix:");
	for(int i=0 ; i<b.length ; i++){
		for(int j=0 ; j<b[i].length ; j++){
			b[i][j] = sc.nextInt();
		}
	}
	
	int c[][]=new int[3][3];
	
	for(int i=0 ; i<c.length ; i++){
		for(int j=0 ; j<c[i].length ; j++){
			c[i][j] = a[i][j] + b[i][j];
		}
	}
	

	for(int i=0 ; i<c.length ; i++){
		for(int j=0 ; j<c[i].length ; j++){
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	 
}}