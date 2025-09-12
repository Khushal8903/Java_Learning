/*
Q9. Write a Java program to find the maximum of all subarrays of size k. 
 
  Example: 
    Input: arr = [1,3,-1,-3,5,3,6,7], k = 3 
    Output: [3,3,5,5,6,7] 
    Explanation: Each window gives a maximum →  
    [1,3,-1] → 3   
    [3,-1,-3] → 3   
    [-1,-3,5] → 5   
    [-3,5,3] → 5   
    [5,3,6] → 6   
    [3,6,7] → 7
*/
import java.util.*;
public class Q9{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[]={1,3,-1,-3,5,3,6,7};
	int k=2;
	int start =0 , end = k;
	
	while(end<=a.length-1){
		int max=0;
			for(int i=start ; i<=end ; i++){
				if(max<a[i]){
					max=a[i];
				}
			}
			System.out.print(max+" ");
		
		start++;
		end++;
	}
	}
}