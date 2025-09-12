public class  SwapWithoutVar{
 public static void main (String x[]){
	 
    int a =10 ; 
	int b =20;
	
	System.out.println( a + "  " + b);
	 
	
	 a = a-b ; 
	 
	 b =a + b;
	 
	 a = b-a;
	
		System.out.println( a + "  " + b);
 
 }
}