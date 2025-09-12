/*
Q7. Rotate a given n × n matrix 90 degrees clockwise without using an extra matrix.
 Additionally, write logic to rotate each concentric square layer separately.
Example:
	Input:
1  2  3
4  5  6
7  8  9

1 4 7
2 5 8 
3 6 9

90° Rotation:
7 4 1
8 5 2
9 6 3
*/
import java.util.*;
public class Q7{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the matrix:");
	int n = sc.nextInt();
	int a[][] = new int[n][n];
	
	System.out.print("Enter the value of the Matrix:");
	
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ;j++){
			a[i][j] = sc.nextInt();
		}
	}
	
	for(int i=0 ; i<a.length ; i++){
		for(int j=i ; j<a[i].length ;j++){
			int temp = a[i][j];
			a[i][j] = a[j][i];
			a[j][i] = temp;
		}
	}
	
	int r=0 , l=n-1; ; 
	
	for(int i=0 ; i<a.length ; i++){
			int temp = a[i][r];
			a[i][r] = a[i][l];
			a[i][l] = temp;
	
	}
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ;j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	}
}
	
	
	
	
	
	