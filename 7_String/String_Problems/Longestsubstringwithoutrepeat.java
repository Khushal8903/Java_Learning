import java.util.*;
public class Longestsubstringwithoutrepeat{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		int left=0, max=0,start=0;
		Set<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++){
			while(set.contains(s.charAt(i))){
				set.remove(s.charAt(left++));
				
			}
			set.add(s.charAt(i));
			max = Math.max(max , i-left +1);
			start = left;
			
		}
		System.out.println(max);
		System.out.println(s.substring(start , start+max));
	}
}