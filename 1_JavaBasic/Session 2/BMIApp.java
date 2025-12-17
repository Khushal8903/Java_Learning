import java.util.*;
public class BMIApp{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("Enter the Height of person in CM:");
	double height= in.nextInt();
	System.out.printf("Enter the Weight of Person in Kg:");
	double weight = in.nextInt();
	
	double BMI =(weight/(height*height))*10000;
	
	System.out.printf("The BMI of the person is: %f " , BMI);
	
	
	}
}