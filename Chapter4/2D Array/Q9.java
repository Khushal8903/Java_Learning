/*
Q9. Write a Java program to traverse a given N x N 2D array in spiral order, but only print elements that are prime numbers.
Example:
Input:  
4x4 matrix  
1  2  3  4  
5  6  7  8  
9 10 11 12  
13 14 15 16  
Output:  
2 3 7 11 13
*/
import java.util.*;
public class Q9{
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
	int z[] = new int[n*n];
	int t=0 , b=n-1 , l=0 , r=n-1, c=0;
	
	
	while(t<b && l<r){
		for(int i=t ; i<=r ; i++){
			z[c] = a[t][i];
			c++;
		}
		t++;
		
		for(int i=t ; i<=b ;i++){
			z[c] = a[i][b];
			c++;
		}
		b--;
		
		for(int i=b ; i>=l ; i--){
			z[c] = a[r][i];
			c++;
		}
		r--;
		
		for(int i=r ; i>=t ; i--){
			z[c] = a[i][l];
			c++;
		}
		l++;
		
	}
	
	for(int i=0 ; i<z.length;i++){
		System.out.print(z[i]+" ");
	}
	
	System.out.println();
	
	for(int i=0 ; i<z.length ;i++){
		boolean f = true;
		int g = z[i];
		
		for(int j=2 ; j<g ; j++){
			
			if(g%j==0 || g==1){
				f = false;
			}else if(g==2){
				f = true;
				break;
			}
			
			
		}
		
			if(f){
				System.out.print(g + " ");
			}
		
		
		
	}
	
	
	}}
	