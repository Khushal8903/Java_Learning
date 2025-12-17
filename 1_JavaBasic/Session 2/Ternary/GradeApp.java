/*
Q51. Print a grade using ternary operators:
90+: A


80–89: B


70–79: C


<70: F
*/

import java.util.*;
public class GradeApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the marks:");
	int m = sc.nextInt();
	
	String str =  100 >= m && 90 <= m ? "A" : 
				   89 >= m && 80 <= m ? "B" :
				   79 >= m && 70 <= m ? "C": "F" ;
				   
	System.out.printf(str);
				   
	
	}
}