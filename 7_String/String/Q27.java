/*
Q27. Reverse each word but keep word order same.
 Input : Java is fun
 Output : avaJ si nuf
*/
import java.util.*;
public class Q27{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	String str = sc.nextLine();
	
	String s[] = str.split(" ");
	StringBuilder sb = new StringBuilder();
	
	for(int i=0;i<s.length;i++){
		StringBuilder s1 = new StringBuilder(s[i]);
		sb.append(s1.reverse()).append(" ");
		
	}
	String s3 = sb.toString().trim();
	System.out.println(s3);
	
	}
}