// Passing Array as a Parameter
import java.util.*;
public class PassingArrayParameter{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the Array:");
	int size = sc.nextInt();
	int a[] = new int[size];
	
	System.out.print("Enter the Value:");
	for(int i=0; i<a.length ; i++){
		a[i]=sc.nextInt();
	}
	
	float res = avgMarks(a);
	System.out.print("Percentage:"+ res);
	
	}
	
	public static  float avgMarks(int m[]){
		float per=0;
		int sum=0;
		for(int i=0 ; i<m.length;i++){
			sum = sum+m[i];
		}
		per = (sum*100)/(100*m.length);
		return per;
	}
}