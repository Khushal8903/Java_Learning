//Find First Negative Number in Every Window of Size K
//For each window of size k, find the first negative number.
import java.util.*;
public class FindFirstNegativeNumberinEveryWindowofSizeK2{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	int k=2, start =0 ,end=k-1 ;
	while(end < a.length){
	
		for(int i=start ; i<=end; i++){
			if(a[i]<0){
				System.out.print(a[i]+ " ");
				break;
			}
		}
			start++;
			end++;
	
	}
}
}