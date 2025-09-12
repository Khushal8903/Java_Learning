public class CmToMKm{
	public static void main(String x[]){
	
	int cm = Integer.parseInt(x[0]);
	
	int Km = (cm/100000);
	
	int M1 =  (cm%100000);
	
	
	int M = (M1/100);
	
	
	System.out.println("Kilo Meter: " + Km);
	System.out.println("Meter:" + M );
	
	
	}
}