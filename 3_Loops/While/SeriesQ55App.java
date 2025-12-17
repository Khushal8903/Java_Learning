 //Q55. Write a java program to display following series :5  3  10  6  15  9  20  12  25  15  30  18  35  21  40

import java.util.*;
public class SeriesQ55App{
	public static void main(String x[]){
	int i, t = 3, f = 5;
	
	for(i =1 ; i <= 10 ; i++){
	 int a = t *i;
	 int b = f *i;	 
System.out.printf(" %d  %d " , b , a);	 }
	}
}