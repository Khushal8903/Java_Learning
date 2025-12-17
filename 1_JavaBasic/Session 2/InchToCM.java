import java.util.*;
public class InchToCM{
   public static void main(String x[]){
	   Scanner in = new Scanner(System.in);
   System.out.printf("Enter the Length in Inches:");
   int Inch =in.nextInt();
   
   double   CM = Inch*2.54;
   
   System.out.printf("%d Inches in CM is: %.2f " , Inch , CM);
   
   }

}