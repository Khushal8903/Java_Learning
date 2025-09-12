//Q2. WAP to create create matrix of 3 x 3 and sort the column data  and display it
import java.util.*;
public class Q2{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the value of first matrix:");
	int a[][] = new int[3][3];
	for(int i=0 ; i<a.length ;i++){
		for(int j=0 ; j<a[i].length ;j++){
			a[i][j] = sc.nextInt();
		}
	}
	int b[] = new int[3];
	for(int i=0 ; i<a.length ;i++){
		for(int j=0 ; j<a[i].length ;j++){
			b[j]=a[j][i] ;
			
		}
		
		Arrays.sort(b);
		
		for(int j=0 ; j<b.length ;j++){
			a[j][i] = b[j];
		}
	}
	
	for(int i=0 ; i<a.length ;i++){
		for(int j=0 ; j<a[i].length ;j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	}
}