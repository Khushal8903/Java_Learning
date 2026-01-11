
import java.util.*;

public class CheckAnagram {

    public boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckAnagram ca = new CheckAnagram();
        System.out.println("Enter the First String :");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String :");
        String s2 = sc.nextLine();

        if (ca.isAnagram(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

}

