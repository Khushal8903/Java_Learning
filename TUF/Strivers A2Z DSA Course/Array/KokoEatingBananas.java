import java.util.*;
class ArrayAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter Array Elements :");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			
		}
		
		Array as=new Array();

		as.Sortrray(a);
		
		
		
	
	}
}
class Array{
	
	void Sortrray(int a[]){
		int min=Integer.MAX_VALUE;
		int e1=0;
		int e2=0;
		for(int i=0;i<a.length;i++){
		
			for(int j=i+1;j<a.length;j++){
				
				int k=a[i]+a[j];
				
				if(k>0){
					
					if(k<min){
						min=k;
						e1=a[i];
						e2=a[j];
					}
				}
				else{
					
					if(k>min){
						min=k;
						e1=a[i];
						e2=a[j];
					}
				}
			}
			if(min==0){
				System.out.print(e1 +","+e2);
			}
		}
		System.out.println(e1+","+e2);
	
	}
}