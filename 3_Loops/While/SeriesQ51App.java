//Q51. Write a java program to display following series : 	1  2  2  4  3  6  4  8  5  10  6  12
import java.util.*;
public class SeriesQ51App{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	
	
	for(int i = 1; i <=num ; i++){
	
	int prdt = i+i;
	
	System.out.printf(" %d  %d " ,i , prdt);
	
	}
}}