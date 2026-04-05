import java.util.*;
public class CountVCD{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		int vowel = 0 , consonent = 0 , digit=0;
		for(char ch : s.toCharArray()){
			if(ch >= 'a' && ch <= 'z'){
				if("aeiou".indexOf(ch) !=-1){
					vowel++;
				}else{
					consonent++;
				}
			}else{
				digit++;
			}
		}
		System.out.println("Vowel :" + vowel);
		System.out.println("Consonent :" + consonent);
		System.out.println("Digit :" + digit);
	}
}