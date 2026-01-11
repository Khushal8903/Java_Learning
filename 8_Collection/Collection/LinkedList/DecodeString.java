/*
19. Decode String
Description:
Decode encoded format like "3[a2[c]]".
Example:
Input: "3[a]2[bc]"
Output: "aaabcbc"
*/
import java.util.*;
public class DecodeString{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();
		String s="";
		
		Stack<String> s1 = new Stack<>();
		boolean flag=false;
		int num=0;
		for(int i=0;i<str.length(); i++){
			char ch=str.charAt(i);
			
			if(Character.isDigit(ch)){
				num=ch-'0';			
			}	
			
			if(ch=='['){
				flag=true;
			}
			if(ch==']'){
				flag=false;
			}
			if(flag&&(ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')){
				for(int j=0;j<num;j++){
					s1.push(ch);
				}
			}
		}
		System.out.println(s1);	
	}
}