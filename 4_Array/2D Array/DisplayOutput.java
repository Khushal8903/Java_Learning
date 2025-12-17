//2-Dimensional Array
import java.util.*;
public class DisplayOutput{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	int a[][] = new int[3][3];
	System.out.print("Enter the 3 roe and 3 column Input:");
	for(int i=0 ; i<a.length ; i++){
		for(int j=0;j<a[i].length; j++){
			a[i][j] = sc.nextInt();
		}
	}
	
	for(int i=0 ; i<a.length ; i++){
		for(int j=0;j<a[i].length; j++){
			System.out.printf("%d\t",a[i][j]);
		}
		System.out.println();
	}
	
	}
}