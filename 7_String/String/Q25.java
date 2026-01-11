/*
Q25. Two strings are anagrams if they contain same characters with same frequency.
 Input : listen, silent
 Output : Anagram
*/
import java.util.*;
public class Q25{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String s1 = sc.nextLine();
	
	char ch[] =s.toCharArray();
	char ch1[] = s1.toCharArray();
	
	Arrays.sort(ch);
	Arrays.sort(ch1);
	boolean b = true;
	for(int i=0;i<ch.length;i++){
		if(ch[i] != ch1[i]){
			b = false;
		}
	}
	
	String result = (b)  ? "Anagram" : "Not Anagram";
	System.out.println(result);
	
	
	}
}