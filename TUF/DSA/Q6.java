
import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.next();
        System.out.println("Enter the no of suffix :");
        int n = sc.nextInt();
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(sc.next());
        }
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            int k = s.indexOf(ar.get(i));
            if (k > 0) {
                sum += s.length() - (k + ar.get(i).length());
            }
        }
        System.out.println(sum);
    }
}
