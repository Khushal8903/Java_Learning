//Q10. Write a Java program to input a 2D array (matrix) and calculate the sum of each row and the sum of each column, then display the results.
import java.util.*;
public class Q10{
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
		for(int j=0 ; j<a[i].length ;j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	 System.out.println("\nSum of each row:");
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += a[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }
		
	 System.out.println("\nSum of each column:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += a[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum = " + colSum);
        }
	}
}