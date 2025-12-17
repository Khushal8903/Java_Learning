
import java.util.Scanner;

public class MergeOverlappingSubintervals {

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[4][2];
        System.out.println("Enter the Value of the Array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i < a.length; i++) {

            int s = (a[i - 1][1]);
            int e = (a[i][0]);
            if (s > e) {

                System.out.println("(" + a[i - 1][0] + "," + a[i][1] + ")");
                i++;
            } else {
                System.out.println("(" + a[i - 1][0] + "," + a[i - 1][1] + ")");

            }
        }
        System.out.println("(" + a[a.length - 1][0] + "," + a[a.length - 1][1] + ")");

    }
}
