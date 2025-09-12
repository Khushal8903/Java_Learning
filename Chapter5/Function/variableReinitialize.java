//Example for local variable reinitialization 
import java.util.*;
public class variableReinitialize
{
    public static void main(String x[])
	{
	    int t=200;
		display(t);
		display(t);
		display(t);
		display(t);
		
	}
	public static void display(int t)
	{  int m=100;
	      m = m+1;
	   System.out.println("Result is  "+(t*m));
	    
	}
	
}
