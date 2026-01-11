/*
Q21. Traverse the string and count how many times each character appears.
 Input : programming
 Output : p=1 r=2 o=1 g=2 a=1 m=2 i=1 n=1
*/
import java.util.*;
public class Q21{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String s = sc.nextLine();
	
	HashMap< Character, Integer> map = new HashMap<>();
	
	
	for(int i=0;i<s.length();i++){
		if(map.containsKey(s.charAt(i))){
			map.put(s.charAt(i) , map.get(s.charAt(i))+1);
		}else{
			map.put(s.charAt(i) , 1);
		}
	}
	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + "=" + entry.getValue());
	}

	}
}