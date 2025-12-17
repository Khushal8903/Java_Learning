/*
3
44
555
6666
555
44
3
*/

import java.util.*;
public class Pattern31{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the numbe rof row:");
	int n = sc.nextInt();
	int count =2;
	for(int i=1; i<=n; i++){
		int a=i;
	if(i<=4){
		count++;
	}else if(i>4){
		count--;
		a=8-a;
	}
	for(int j=1; j<=a; j++){
		System.out.print(count);
		
	}
	System.out.println();
	}
}}