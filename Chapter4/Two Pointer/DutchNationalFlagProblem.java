//Sort Colors (Dutch National Flag Problem)
//Sort an array of 0s, 1s, and 2s using two/three pointers.
import java.util.*;
public class DutchNationalFlagProblem{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	int l=0, m=0 , h = a.length-1;
	while(m<h){
		if(a[m]==0){
			int temp = a[l];
			a[l] = a[m];
			a[m] = temp;
			m++;
			l++;
		}else if(a[m] ==1){
			m++;
		}else{
			int temp = a[h];
			a[h] = a[m];
			a[m] = temp;
			h--;
			
		}
		
	}
	
	for(int i=0 ;i<a.length;i++){
		System.out.print(a[i]);
	}
	
	}
}