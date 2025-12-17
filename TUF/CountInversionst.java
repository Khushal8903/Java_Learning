
import java.util.*;

public class CountInversionst {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Value of the Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println("[" + arr[i] + "," + arr[j] + "]");
                }
            }
        }

    }
}
