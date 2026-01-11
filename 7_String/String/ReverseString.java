
import java.util.*;

class ReverseString {

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String s1 = sc.nextLine();
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }
        System.out.print(s2);
        sc.close();
    }
}
