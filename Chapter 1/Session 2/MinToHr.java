import java.util.*;
public class MinToHr{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("Enter the min:");
	 int min1 = in.nextInt(); //65
	 
	 int Hr = min1/60;
	 int min = min1%60 ; 
	 
	 System.out.printf(" %d Hour and %d Min " ,Hr , min);
	 
	
	}
}
