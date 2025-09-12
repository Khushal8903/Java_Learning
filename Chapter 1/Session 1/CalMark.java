public class CalMark{
  public static void main(String x[]){
    int m1 = Integer.parseInt(x[0]);
	int m2 = Integer.parseInt(x[1]);
	int m3 = Integer.parseInt(x[2]);
	int m4 = Integer.parseInt(x[3]);
	int m5 = Integer.parseInt(x[4]);
	
	int Total = m5+m1+m2+m3+m4;
	
	System.out.println("Total marks is : " + Total);
	
	float Perct = Total/5;
	
	System.out.println("Percentage of the Student is : " + Perct);
	
  }
}