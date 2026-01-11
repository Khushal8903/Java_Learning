
import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the number of string: ");
        ArrayList<Integer> ar = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();

            int a1 = Integer.parseInt(a, 2);
            int b1 = Integer.parseInt(b, 2);

            int temp = a1 + b1;
            ar.add(temp);
        }
        System.out.println(ar);

        int maxval = Collections.max(ar);
        System.out.println(Integer.toBinaryString(maxval));
    }
}
