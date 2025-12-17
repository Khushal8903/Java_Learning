//Q5. WAP to create 3 x 3 matrix and find the second max from every column.
import java.util.*;
public class Q5{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[][] = new int[3][3];
	
	System.out.print("Enter the value of the Matrix:");
	
	for(int i=0 ; i<a.length ; i++){
		for(int j=0 ; j<a[i].length ;j++){
			a[i][j] = sc.nextInt();
		}
	}
	
	int b[] = new int[3];
	
	for(int i=0; i<a.length ; i++){
	
		for(int j=0 ; j<a[i].length;j++){
			b[j] = a[j][i];
		}
		
		int max=0 , sMax=0;
		
		for(int k=0 ; k<b.length;k++){
			if(b[k]>max){
				max = b[k];
			}
			
		for(int l=0; l<b.length;l++)	 
			if(b[l]>sMax && b[l]<max){
					sMax = b[l];
			}
		
		}
		
		System.out.print("SMax ="+ sMax);
		System.out.println();
	}
	
	}
}
	
	
	