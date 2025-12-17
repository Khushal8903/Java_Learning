/*
Enter the number of Row:5
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
*/
import java.util.*;
public class Pattern49{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of Row:");
	int  n = sc.nextInt();
	int a=1;
	for(int i=1; i<=n; i++){
	int ch=65;
		for(int j=1 ; j<=a; j++){
			System.out.print((char)ch);
			if(j<i){
				ch++;
			}else{
				ch--;
			}
		}
		a+=2;
		System.out.println();
	}
	}
}