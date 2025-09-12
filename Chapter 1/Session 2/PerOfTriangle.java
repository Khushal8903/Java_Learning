import java.util.*;
public class PerOfTriangle{
   public static void main(String x[]){
   
   Scanner in = new Scanner(System.in);
   
   System.out.printf("Enter the length of first side:");
    int Side1 = in.nextInt();
	System.out.printf("Enter the length of Second side:");
    int Side2 = in.nextInt();
	System.out.printf("Enter the length of Third side:");
    int Side3 = in.nextInt();
	
   int per = Side1+Side2+Side3;
   System.out.printf("The Perimeter of the Triangle is: %d", per);   
   
   
   }
}