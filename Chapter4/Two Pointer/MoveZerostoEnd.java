//Move Zeros to End
//Move all 0s to the end of the array while maintaining the order of non-zero elements.
import java.util.*;
public class MoveZerostoEnd{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[5];
		System.out.println("Enter VAlue in Array: ");
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int j=0;
		for(int i=0; i<a.length; i++){
			if(a[i]!=0){
					//Swapping 
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				
			j++;	
			}
			
		}
		for(int i=0; i<a.length; i++){
			
			System.out.print(a[i] + " ");
			
		}
	}
	
}