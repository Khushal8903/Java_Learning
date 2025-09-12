import java.util.*;
public class SqAndSqrt{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("Enter the Num:");
	int num = in.nextInt();
	
	int Sq = num*num;
	double Sqrt = Math.sqrt(num);
	
	System.out.printf("Sq of the num is : %d and the Sqrt of the num is : %.2f " , Sq , Sqrt);
	
	}
}