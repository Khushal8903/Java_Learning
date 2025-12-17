/*
Enter the number of Row:5
ABCDEDCBA
ABCD DCBA
ABC   CBA
AB     BA
A       A
*/
import java.util.*;
public class Pattern50{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of Row:");
	int  n = sc.nextInt();
	
	for(int i=1; i<=n; i++){
	int ch=65;
		for(int j=1 ; j<=(n+n)-1; j++){
			if(j<=6-i){
				System.out.print((char)ch);
			}else if(j>=4+i){
				
				System.out.print((char)ch);
			}else{
				System.out.print(" ");
			}
			
			if(j<6-i){
				ch++;
			}else if(j>=4+i){
				ch--;
			}
			
		}
		
		System.out.println();
	}
	}
}