public class FindFLDigit{
	public static void main(String x[]){
	 
	 int num = Integer.parseInt(x[0]);
	 
	 int Last = num %10;
	 
	 int First = num/100;

	 
	 System.out.println("First num is: " + First );
     System.out.println("Last num is: " + Last);	 
	
	}

}