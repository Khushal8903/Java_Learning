/*
Q6. Write a Java program to print the elements of a given n × n matrix in spiral order, and then print the same matrix in reverse spiral order.
Example:
	Input:
1  2  3
4  5  6
7  8  9

Output Spiral: 1 2 3 6 9 8 7 4 5  
Output Reverse Spiral: 5 4 7 8 9 6 3 2 1

*/
import java.util.*;
public class Q6{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[][] = new int[3][3];
	
	System.out.print("Enter the value of the Matrix:");
	
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ;j++){
			a[i][j] = sc.nextInt();
		}
	}
	
	int z[] = new int[9];
	
	int t=0 ,b=2 , l=0 , r=2 , c=0;
	
	for(int i=t ; i<=r ; i++){
		z[c] = a[t][i];
		c++;
	}
	
	t++;
	
	for(int i=t ; i<=b ; i++){
		z[c] = a[i][r];
		c++;
	}
	r--;
	for(int i=r ; i>=l ; i--){
		z[c] = a[b][i];
		c++;
	}
	b--;
	for(int i=l ; i<=t ; i++){
		z[c] = a[b][i];
		c++;
	}
	
	int rev[] = new int [9];
	int j=z.length-1;
	for(int i=0; i<z.length ; i++){
			System.out.print(z[i]+" ");
			rev[i] = z[j];
			j--;
		}
		
		System.out.println("\nOutput Reverse Spiral:");
	for(int i = 0 ; i<rev.length ; i++){
		
		System.out.print( rev[i] +" ");
	}
		
	}
}