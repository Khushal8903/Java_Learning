//Maximum Number of Vowels in a Substring of Given Length
//Find the maximum number of vowels in any substring of length k.
import java.util.*;
public class MaximumNumberVowelsSubstringGivenLength{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter the String");
	String str = sc.nextLine();
	char a[] = str.toCharArray();
	int k=3,count=0, max=0;
	int start=0 , end= k-1;
	

	for(int i=0 ; i<k ; i++){
		char ch = a[i];
			
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
					count++;
			}
			if(max<count){
			max=count;
		}
			
		}
	for(int i=k	; i<a.length ; i++){
			
			 int ch = a[i - k];
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
					count--;
			}
			 ch = a[i];
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
					count++;
			}
			if(max<count){
			max=count;
		}
			
		}
	
		
	
	System.out.printf("maximum number of vowels in substring is:%d",max);
}
}