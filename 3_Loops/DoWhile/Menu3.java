/*
Q3.Write a menu-driven program using switch and do-while to perform operations on a single character:
Check if the character is an alphabet.
If alphabet, check vowel or consonant.
If digit, check even or odd.
Convert uppercase to lowercase or vice versa.
Exit the program
*/
import java.util.*;
public class Menu3{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
		
	System.out.print("Enter the Input:");
	char ch=sc.next().charAt(0);
	int n=0;
	do{
		System.out.println("\n------ Character Menu ------");
            System.out.println("1. Check if the character is an alphabet");
            System.out.println("2. If alphabet, check vowel or consonant");
            System.out.println("3. If digit, check even or odd");
            System.out.println("4. Convert uppercase to lowercase or vice versa");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            n = sc.nextInt();
			
		switch(n){
		    case 1:
				if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
					System.out.printf("Input is alphabet");
				}else{
					System.out.printf("Input is not alphabet");
				}
				break;
			
			case 2:
				if(ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				   System.out.printf("Alphabet is vowel");
				}else{
					System.out.printf("Alphabet is consonant");
				}
				break;
			case 3:
				if(ch>='1' || ch<='9'){
				    System.out.println("Input is Number");
					if(ch%2==0){
					System.out.println("Number is Even");
					}else{
					System.out.println("Number is Odd");
					}
				}
				break;
			case 4:
				if(ch>='A' && ch<='Z'){
				   int up = 32+(int)ch;
				   System.out.print((char)up);
				}else if(ch>='a' && ch<='z'){
				  int lw = (int)ch-32;
				   System.out.print((char)lw);
				}
				break;
			case 5:
				break;
			default :
				   System.out.print("Invalid Input");
				
	}}while(n!=5);
	}
}