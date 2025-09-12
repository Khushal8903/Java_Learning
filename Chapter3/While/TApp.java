//WAP to input number from keyboard and print its table using multiplication.
import java.util.*;
public class TApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int tab , i=1;
	while(i<=10){
	tab = i * num;
	System.out.printf("%d x %d = %d\n", i ,num ,tab);
	i++;
	}
	
	}
}