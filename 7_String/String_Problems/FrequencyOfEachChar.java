import java.util.*;
public class FrequencyOfEachChar{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		int arr[] = new int[26];
		for(int i=0;i<s.length() ;i++){
			 char ch = s.charAt(i);
			 int fre = arr[ch-'a'];
			 arr[ch-'a']=fre+1;
		}
		
		for(int i =0;i<arr.length ;i++){
			if(arr[i] > 0){
			char ch = (char)(i + 'a');
				System.out.println(ch + "=" + arr[i]);
			}
		}
	}
}