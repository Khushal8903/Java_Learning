//Q52. Print the middle value among 3 distinct integers.
import java.util.*;
public class DistInt{
	public static void main(String []x){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Enter the first num:");
	int a = sc.nextInt();
	System.out.printf("Enter the second num:");
	int b = sc.nextInt();
	System.out.printf("Enter the third num:");
	int c = sc.nextInt();
	
     int num = (a >b&&a<c||a>c && a<b)? a : 
				(b>a&&b<c || b>c&&b<a)? b: c ;
			
	System.out.println(num);

}
}