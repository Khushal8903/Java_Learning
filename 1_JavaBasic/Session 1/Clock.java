public class Clock{
   public static void main (String x[]){
   
     int Secd = Integer.parseInt(x[0]); //12200
	
	  int sec = Secd % 60;  //20   
	  
	  int temp = Secd / 60;  //203
	  
	  int min = temp%60; //23
	  
	  int Hr = temp /60; //3
	 

	  
	 
	 
	   System.out.println(Hr +"Hr::" + min + "Min::"+ sec +  "Sec" );
	
	 
   
   }

}