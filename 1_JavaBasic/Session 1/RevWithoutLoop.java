public class RevWithoutLoop{
 public static void main (String x[]){
	
     int a = Integer.parseInt(x[0]);//123
	    int b = a%10;  //3
		int c  = a/10;  //12
		
		 b = b*10 + (c%10);  //32
		int e = c/10; //1
		
		 b = b*10 + (e%10); //321
        
     
	 
	 System.out.printf("%d",b);//321
 }
}