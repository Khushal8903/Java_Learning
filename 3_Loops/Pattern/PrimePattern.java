class PrimePattern{
	public static void main(String x[]){
		int num[] = {-1,-1,1};
        int cnt=0 ,k=0;
        int left = 0 , right=0 ;
        int n=num.length;
        int sum=0;
        while(right<n){

            sum+=num[right];
			
			while(sum > k && left <=right){
				sum-=num[left++];
			}
			
			if(sum == k){
				cnt++;
			}
			right++;
    }
	
	System.out.println(cnt);
  } 		
}
