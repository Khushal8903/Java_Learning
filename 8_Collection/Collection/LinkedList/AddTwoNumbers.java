/*
15. Add Two Numbers II
Description:
Add numbers represented by linked lists (most significant digit first).
Example:
Input: 7→2→4→3 + 5→6→4
Output: 7→8→0→7
*/
import java.util.*;
public class AddTwoNumbers{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the 1st data set :");
		int n=sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<>();
		
		for(int i=0 ;i<n;i++){
			ll.add(sc.nextInt());
		}
		System.out.println("Enter the size of the 2nd data set :");
		int n1=sc.nextInt();
		LinkedList<Integer> ll1 = new LinkedList<>();
		
		for(int i=0 ;i<n1;i++){
			ll1.add(sc.nextInt());
		}
		
		int num=0;
		for(int i: ll){
			num = num*10+i;
		}
		int num1=0;
		for(int i: ll1){
			num1 = num1*10+i;
		}
		int res = num+num1;
		
		ll.clear();
		
		while(res!=0){
			ll.add(res%10);
			res/=10;
		}
		Collections.reverse(ll);
		
		System.out.println(ll);
		
	}
}
		