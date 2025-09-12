import java.util.*;
public class AscToCharApp{
	public static void main(String x[]){
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter the Asc no. of the Charecter: ");
	 int Asc = in.nextInt();
	 
	 char ch = (char) Asc;
	 
	 System.out.println("The charecter of the ASCII value is: " + ch);
	 
	}

}