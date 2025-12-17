
import java.util.Scanner;

public class Findtherepeatingandmissingnumber {

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Value of the Array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int dup = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    dup = a[j];
                }
            }
        }
        System.out.println("Duplicate number is:" + dup);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        int newsum = (n * (n + 1) / 2);

        int miss = newsum - sum;
        miss = miss + dup;
        System.out.println("Missing number is:" + miss);

    }
}
