
import java.util.*;

public class LargestElement {

    public static void main(String[] args) {
        solution s = new solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = s.LargestElement(arr);
        System.err.println(res);
        sc.close();
    }
}

class solution {

    int LargestElement(int[] a) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
        
    }

}
