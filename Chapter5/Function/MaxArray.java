//Find max of the Array
import java.util.*;
public class MaxArray{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the size of the Array:");
	int size = sc.nextInt();
	int a[] = new int[size];
	System.out.print("Enter the value in Array:");
	for(int i=0 ; i<a.length ; i++){
		a[i] = sc.nextInt();
	}
	
	MaxArray mx = new MaxArray();
	int max = mx.maxArray(a);
	
	System.out.print("Max Value in the Array is:"+ max);
	}
	
	public  int maxArray(int b[]){
			int max =0 ;
			
			for(int i=0 ; i<b.length;i++){
				if(b[i] > max){
					max = b[i];
				}
			}
			return max;
	}
}
