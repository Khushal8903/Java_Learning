//Q6. Write a java program to search element in array , its element found or not.
import java.util.*;
public class ArraySearch{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the size of Array:");
	int n= sc.nextInt();

	int a[] = new int[n];
	System.out.printf("Enter the %d value of Array:",n);

	for(int i=0; i<n; i++){
	  a[i] = sc.nextInt();
	}
	
	System.out.printf("Enter the Search number:");
	int b = sc.nextInt();
	boolean f=false;
	int idx=0;
	for(int i=0; i<a.length; i++){
	   if(b==a[i]){
		   f=true;
		  	break;
	   }else{
  
	   }
	idx=i+1;
	}
	if(f){
		System.out.printf("Number is Found at index: %d", idx);
		
	   }else{
		 System.out.printf("Number is Not Found");  
	   }
	
	}
}