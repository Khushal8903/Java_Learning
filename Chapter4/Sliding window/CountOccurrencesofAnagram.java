//Count Occurrences of Anagram
//Count how many times an anagram of a string appears in another string.

import java.util.*;
public class CountOccurrencesofAnagram{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the text string: ");
        String text = sc.nextLine();

        System.out.print("Enter the pattern string: ");
        String str = sc.nextLine();

        char a[] = text.toCharArray();
		char b[] = str.toCharArray();
		int k=b.length;
		int add=0, start=0 , end = k-1;
	while(end <a.length){
		int count =0; 
		for(int i=start; i<=end ; i++){
		   int j=0;
			while(j<b.length){
				if(a[i]==b[j]){
					count++;
				}
					j++;
			}
		}
		if(count == k){
			add++;
		}
		start++;
		end++;
	}
	System.out.print(add);
	}
}