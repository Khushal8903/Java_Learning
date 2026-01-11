/*
6. Spiral Matrix
Description:
Return all elements of a matrix in spiral order using ArrayList.
Example:
Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
*/
import java.util.*;
public class SpiralMatrix{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		// ArrayList<Integer []> ar = new ArrayList<>();
		// ArrayList<Integer> result = new ArrayList<>();
		
		// System.out.println("Enter the size of the Data Set:");
		// int n = sc.nextInt();
		// Integer arr[] = new Integer[3];
		
		// for(int j =0 ; j<n ; j++){
			
				 // arr[0] = sc.nextInt();
				 // arr[1] = sc.nextInt();
				 // arr[2] = sc.nextInt();
			// ar.add(arr);
		// }
		
		ArrayList<Integer[]> ar = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

      
        for (int j = 0; j < n; j++) {
            Integer arr[] = new Integer[3];   
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            ar.add(arr);
        }
		
		int l=0, r=0, t=1, d=1;
		
		while(r<3){
			result.add((ar.get(l))[r]);
			r++;
		}
		r--;
		
		
		//r=2
		
		while(d<3){
			result.add((ar.get(d))[r]);
			d++;
		}
		
		d--;
		
		while(t>=0){
			result.add((ar.get(d))[t]);
			t--;
		}
		
		
		while(l<2){
			result.add((ar.get(1))[l]);
			l++;
		}
		
		System.out.println(result);
		
	}
}