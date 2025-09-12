// Q52. Write a java program to display following series :2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1 
import java.util.*;
public class SeriesQ52App{
	public static void main(String x[]){
	int i, j ,count = 9;
	for(i =1 ; i <= 9 ; i++){
	   int cube =  count *count*count;
	   --count;
	   int t = i*2; 
	System.out.printf(" %d  %d " , t , cube);
	
	}
	
	
	}}