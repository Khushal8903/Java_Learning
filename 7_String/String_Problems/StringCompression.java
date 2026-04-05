import java.util.*;
public class StringCompression{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		String res="";
		int count=1;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i-1) != s.charAt(i)){
				char ch = s.charAt(i-1);
				res += ch +""+ count;
				count=1;
			}else{
				count++;
			}
		}
		System.out.println(res);
	}
}