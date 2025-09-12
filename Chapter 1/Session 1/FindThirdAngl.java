public class FindThirdAngl{
	public static void main(String x[]){
	 
	 int angle1 = Integer.parseInt(x[0]);
	 int angle2 = Integer.parseInt(x[1]);
	 
	 int angle3 = 180-(angle1+angle2);
	 
	 System.out.println("The Third angle of the tringle is: " + angle3);
	 
	}
}