//Q12. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
import java.util.*;
public class CVApp{
	public static void main(String xx[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Age of Candidate:");
	int age = sc.nextInt();
	if(age>18){
	System.out.printf("Candidate can Vote");
	}else{
	Syatem.out.printf("Candidate can't Vote");
	}