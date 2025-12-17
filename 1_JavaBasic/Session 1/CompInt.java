public class CompInt{
   public static void main (String x[]){
   
    int P = Integer.parseInt(x[0]);
	Float R  = Float.parseFloat(x[1]);
	Float T = Float.parseFloat(x[2]);
	
	
	Double Total = P*(Math.pow((1+R/100),T));
	System.out.println("Total Returnable Amt is : " + Total );
	 
	 Double CI  = Total - P;
	 System.out.println("The Compound Interest is: " + CI);
	
	
   
   }

}