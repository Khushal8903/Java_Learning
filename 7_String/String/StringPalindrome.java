
import java.util.*;

class StringPalindrome {

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String s1 = sc.nextLine();
        String s2 = s1;
        String s3 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s3 += s1.charAt(i);
						
        }
        if (s2.equals(s3)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
