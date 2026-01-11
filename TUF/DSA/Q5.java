
import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();
        System.out.println("Enter the String length : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ar.add(sc.next());
        }
        System.out.print("Enter the trget and start: ");
        String target = sc.next();
        int e = ar.indexOf(target);
        int s = sc.nextInt();

        if (s == e) {
            System.out.println(0);
            return;
        }
        if (Math.abs(s - e) == 1) {
            System.out.println(1);
            return;
        }
        int f = 0;
        int b = 0;
        if (s < e) {
            f = e - s;
            b = s + (n - 1 - e) + 1;
            System.out.print(Math.min(f, b));
            return;

        } else {
            f = e + (n - 1 - s) + 1;
            b = s - e;
            System.out.print(Math.min(f, b));
            return;
        }

    }
}
