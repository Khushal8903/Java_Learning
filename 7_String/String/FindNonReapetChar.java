/*Find the first non-repeated character. */

import java.util.Scanner;

public class FindNonReapetChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean f = true;
            for (int j = i + 1; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    f = false;
                    break;
                }
            }
            if (f) {
                System.out.println(ch);
                break;
            }
        }

    }
}
