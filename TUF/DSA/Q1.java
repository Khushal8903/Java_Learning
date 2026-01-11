
import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);  // REQUIRED BY QUESTION

        int left = 0, right = n - 1;
        int steps = 0;

        while (left <= right) {
            if (left == right) {
                steps++;        // single element
                break;
            }

            if (arr[left] != arr[right]) {
                left++;
                right--;
                steps++;        // remove two different
            } else {
                right--;        // same elements
                steps++;        // remove one
            }
        }

        System.out.println(steps);
    }
}
