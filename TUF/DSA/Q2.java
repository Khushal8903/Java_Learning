
import java.util.*;

public class Q2 {

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of monster: ");
        int mon = sc.nextInt();
        System.out.println("Enetrt the point: ");
        int point = sc.nextInt();

        ArrayList<int[]> ar = new ArrayList<>();
        
        for (int i = 0; i < mon; i++) {
          int a[] = new int[2];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            ar.add(a);
        }
        int op = 0;
        Collections.sort(ar, Comparator.comparingInt(b -> b[0]));

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i)[0] < point) {
                point += ar.get(i)[1];
                op++;
            }
        }
        System.out.print(op);
    }
}
