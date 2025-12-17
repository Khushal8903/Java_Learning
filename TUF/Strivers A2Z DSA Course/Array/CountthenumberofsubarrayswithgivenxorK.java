
import java.util.Scanner;

public class CountthenumberofsubarrayswithgivenxorK {

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Value of the Array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter thr Target:");
        int k = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            int result = 0;
            for (int j = i; j < a.length; j++) {
                result ^= a[j];
                if (result == k) {
                    for (int t = i; t <= j; t++) {
                        System.out.print(a[t] + " ");
                    }
                    System.out.println();
                }

            }

        }

    }
}
