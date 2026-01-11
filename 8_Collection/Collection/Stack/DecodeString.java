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
		
		// String s = "3[a]2[bc]" ;
	
		// Stack<Integer> st = new Stack<>();
		// Stack<String> st1 = new Stack<>();
		
		// String str = "";
		// for(int i=0;i<s.length() ;i++){
			// if(Character.isDigit(s.charAt(i))){
				// st.push((int)(s.charAt(i))-'0');//2
			// }else if(s.charAt(i) == '['){
					// int j=i+1;//6
					// while(s.charAt(j)!= ']'){
					   // str+=s.charAt(j);//bc
						// j++;//3
					// }
					// st1.push(str);//a
					// str="";
			// }//i=8
		// }
		
		
		// System.out.println(st);
		// System.out.println(st1);
		// int k=0;
		
		// for(int j=0 ; j<st.size();j++){
		// int n=st.get(k);
		// String s1 = st1.get(k);
		// for(int i=0;i<n ;i++){
					// System.out.print(s1);
		// }
		// k++;		
		// }
		
		
		
		
		
		String s = "3[a]2[bc]" ;
	
		Stack<Integer> st = new Stack<>();
		Stack<String> st1 = new Stack<>();
		
		String str = "";
		for(int i=0;i<s.length() ;i++){
			if(Character.isDigit(s.charAt(i))){
				st.push((int)(s.charAt(i))-'0');//2
			}else if(s.charAt(i) == '['){
					int j=i+1;//6
					while(s.charAt(j)!= ']'){
					   str+=s.charAt(j);//bc
						j++;//3
					}
					st1.push(str);//a
					str="";
			}//i=8
		}
		
		
		System.out.println(st);
		System.out.println(st1);
		int k=0;
		
		Stack<String> st2 = new Stack<>();
		
		for(int j=0 ; j<st.size();j++){
		int n=st.get(k);
		String s1 = st1.get(k);
		for(int i=0;i<n ;i++){
					st2.push(s1);
		}
		k++;		
		}
		
		//Collections.reverse(st2);
		//System.out.print(st2);
		
		for(String s3 : st2){
			System.out.print(s3);
		}
		
	}
}