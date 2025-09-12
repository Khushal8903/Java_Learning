//return two value from the fuction using array
import java.util.*;
public class ReturnUsingArray{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	
	ReturnUsingArray ra = new ReturnUsingArray();
	
	int m[] =ra.getSqCube(num);
	 
	System.out.print("Square:"+m[0]+"\nCube:"+m[1]);
	
	
	}
		
	public int[] getSqCube(int n){
			
			int sq = n*n;
			int cube = n*n*n;
			
			int a[] = new int[2];
			a[0] = sq;
			a[1]  = cube;
			
			return  a;
	}
}