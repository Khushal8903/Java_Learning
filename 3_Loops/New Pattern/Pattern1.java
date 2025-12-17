/*
 * Q5. Write a java program to print this pattern.

*****
****
***
**
*

 */
import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Enter the Row:");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.err.print("*");
                }
                System.err.println("");
            }
            sc.close();
        }
    }
}
