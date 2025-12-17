import java.util.*;
public class BillApp{
	public static void main(String x[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.printf("Enter the Bill Amt:");
	 
	 int billAmt = sc.nextInt();
	 
	 int tax = (billAmt*12)/100;
	 int dis = (billAmt*5)/100;
	 int bill = (billAmt+tax)-dis;
	 
	 System.out.printf(" Tax is: %d \n Dis is : %d \n Total bill amt is %d " , tax, dis , bill); 
	
	}
}