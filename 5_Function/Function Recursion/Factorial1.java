//Q6. Write a function to calculate the factorial of a number (using loop only).

import java.util.*;
public class Factorial1
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("factorial :"+fact(n));
    }
	
    public static int fact(int n)
    {  
		int fact=1;
        for(int i=n;i>0;i++)
        {
            fact=fact *i;
			System.out.println(fact);
        }
		return fact;
	}
}