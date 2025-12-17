
import java.util.Scanner;

class LengthofthelongestsubarraywithzeroSum {

    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Value of the Array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum == 0) {
                    int length = j - i + 1;
                    if (max < length) {
                        max = length;
                    }
                }
            }

        }
        System.out.println(max);

    }

}
