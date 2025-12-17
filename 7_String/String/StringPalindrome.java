import java.util.*;
class StringPalindrome{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String s2 = sc.nextLine();
		StringBuilder s = new StringBuilder(s2);
		String rev = "";
		for(int i=s.length()-1 ;i>=0 ; i--){
			rev = rev+s.charAt(i);
		}
		System.out.print(rev);
		if(s2.equals(rev)){
			System.out.print("Palindrome");
		}else{
			System.out.print("Not Palindrome");
		}
		
	}
}