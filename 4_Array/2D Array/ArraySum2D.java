//Sum of the Array
import java.util.*;
public class ArraySum2D{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[][] = new int[3][3];
	
	System.out.print("Enter the Input:");
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length;j++){
			a[i][j] = sc.nextInt();
		}
	}
	int sum=0;
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ; j++){
			sum = sum+a[i][j];
			System.out.printf("%d ",a[i][j]);
		}
		System.out.println();
	}
	System.out.printf("sum = %d",sum);
	}
}