public class SimpleInt{
   public static void main (String x[]){
   
    int P = Integer.parseInt(x[0]);
	Float R  = Float.parseFloat(x[1]);
	Float T = Float.parseFloat(x[2]);
	
	Float SI = (P*R*T)/100;
	
	System.out.println("The simple Interest is: " + SI); 
	 Float Total  = SI + P;
	 
	System.out.println("Total Returnable Amt is : " + Total );
	
   
   }

}