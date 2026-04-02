package com.test;
import java.util.*;
import java.util.Map.Entry;
public class Q10 {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		
		String arr[] = s.split(" ");
		
		HashMap<String , Integer> map = new HashMap<>();
		
		for(String c : arr) {
			if(map.containsKey(c)) {
				map.put(c , map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for( String m : map.keySet()) {
			System.out.println(m + "	:	" + map.get(m) );
		}
		
	}
}
