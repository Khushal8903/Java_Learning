//: WAP to create 3 x 3 matrix and sort its row data
import java.util.*;
public class SortRowData{
  public static void main(String x[]){
	   int a[][]=new int[][]{
						    {1,3,2},
							{4,6,5},
							{9,7,8}
							};
		for(int i=0; i<a.length;i++){
			  Arrays.sort(a[i]);
		}
		
		for(int i=0; i<a.length; i++){
		   for(int j=0; j<a[i].length; j++){
		      System.out.printf("%d\t",a[i][j]);
		   }
		   System.out.printf("\n");
		}
	}
}
