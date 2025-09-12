// WAP to sort columns of matrix 
import java.util.*;
public class SortColumnofMatrix{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[][] = new int[3][3];
	System.out.print("Enter the Value in the Matrix:");
	
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ; j++){
		a[i][j] = sc.nextInt();
		}
	}
	int b[] = new int[3];
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ; j++){
			b[j] = a[j][i];
		}
		Arrays.sort(b);
		
		for(int j=0 ; j<a[i].length ; j++){
			a[j][i] = b[j];
		}
	}
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ; j++){
		System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	}
}