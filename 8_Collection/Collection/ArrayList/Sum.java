/*
5. Sum
Description:
Find all unique triplets (a,b,c) such that a+b+c = 0 using sorting and ArrayList.
Example:
Input: [-1,0,1,2,-1,-4]
Output: [[-1,-1,2], [-1,0,1]]
*/
import java.util.*;
public class Sum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<List<Integer>> ar1 = new ArrayList<>();
		
		System.out.println("Enter the size of the dataset:");
		int n=sc.nextInt();
		
		for(int i=0;i<n ; i++){
			ar.add(sc.nextInt());
		}
		
		for(int i=0 ; i<ar.size()-2; i++){
			for(int j=i+1 ;j<ar.size()-1 ; j++){
				for(int k=j+1 ; k<ar.size() ;k++){
					if((ar.get(i)+ar.get(j)+ar.get(k))== 0){
							ar1.add(Arrays.asList(ar.get(i) , ar.get(j) , ar.get(k)));
					}
					
				}
			}
		}
		
		// for(int i=0;i<ar1.size() ; i++){
			// for(int j: ar1.get(i)){
				// System.out.print(j+" ");
			// }
			// System.out.println();
		// }
		
		System.out.println(ar1);
	}
}

