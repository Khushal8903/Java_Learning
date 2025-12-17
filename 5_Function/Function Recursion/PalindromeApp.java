
public class PalindromeApp{
	public static void main(String x[]){
	int num =121, r=0;
	int  a = isPali(r , num);
	System.out.println(a);
	
	if(a==num){
	System.out.println("Palindrome");
	}
	else{System.out.println(" Not Palindrome");}
	}
	
	
		public static int isPali(int rev,int n){
			
				if(n==0)
				{
					return rev;
				}
					int rem = n%10;
					rev = rev*10+rem;
				return isPali(rev,n/10);
		}
}