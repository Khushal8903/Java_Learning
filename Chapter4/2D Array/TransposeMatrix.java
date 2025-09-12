//Transpose of Matrix
import java.util.*;
public class TransposeMatrix{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[][]=new int[3][3];

	System.out.print("Enter the Input:");
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ;  j++){
			a[i][j]= sc.nextInt();
		}
	}
	/*
	for(int i=0 ; i<a.length ; i++){
		for(int j=i+1 ; j<a[i].length ;  j++){
			int temp =a[i][j];
			a[i][j] = a[j][i];
			a[j][i]= temp;
		}
	}
	*/
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ;  j++){
			System.out.printf("%d  ",a[j][i]);
		}
		System.out.println();
	}
	
	
	
	}
}