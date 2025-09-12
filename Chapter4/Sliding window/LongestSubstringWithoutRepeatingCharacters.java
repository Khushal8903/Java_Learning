//Longest Substring Without Repeating Characters
//Return the length of the longest substring with all unique characters.
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the string:");
	String ch =sc.nextLine();
	
	char a[] = ch.toCharArray();
	int start=0, end =1,count=0,max=0 ;
	
	while(end<a.length){
		count=0;
		for(int j=start ; j<end; j++){
			if(a[j] == a[end]){
				start =j+1;
				break;
			}
		}
		count = end-start+1;
		
		if(max<count){
			max = count;
		}
		
		end++;
	}
		
		System.out.print(max);
	}
}
