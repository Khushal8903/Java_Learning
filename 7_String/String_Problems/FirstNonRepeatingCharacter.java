import java.util.*;
public class FirstNonRepeatingCharacter{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		Map<Character , Integer> map = new HashMap<>();
		for(char ch : s.toCharArray()){
			map.put(ch , map.getOrDefault(ch , 0)+1);
			
		}
		for(char ch : map.keySet()){
			if(map.get(ch)==1){
				System.out.println(ch);
			}
		}
	}
}