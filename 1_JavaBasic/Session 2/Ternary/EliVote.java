//Q42. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
import java.util.*;
public class EliVote{
	public static void main(String x[]){
	Scanner sc  = new Scanner(System.in);
	System.out.printf("Enter the Age of the Candidate:");
	int age = sc.nextInt();
	
	String str = age >= 18 ? "Can Vote" : "Can't Vote" ;
	System.out.println(str);
	}
}