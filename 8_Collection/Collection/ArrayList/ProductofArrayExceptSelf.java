/*
4. Product of Array Except Self
Description:
Return a list output where each element is the product of all other elements. No division allowed.
Example:
Input: [1,2,3,4]
Output: [24,12,8,6]
*/
import java.util.*;
public class ProductofArrayExceptSelf{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<Integer> ar1 = new ArrayList<>();
		
		System.out.println("Enter the size of the dataset:");
		int n=sc.nextInt();
		
		for(int i=0;i<n ; i++){
			ar.add(sc.nextInt());
		}
		
		for(int i=0;i<ar.size() ; i++){
			int mul=1;
			for(int j=0 ; j<ar.size();j++){
					if(i!=j){
						mul=mul*ar.get(j);
					}
			}
			ar1.add(mul);
		}
		for(int i : ar1){
		System.out.print(i+" ");
		}
	}
}