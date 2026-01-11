
public class demo1 {
  public static void main(String[] args) {

        /* 
 1 0 0 0 1 
 0 1 0 1 0 
 0 0 1 0 0 
 0 1 0 1 0 
 1 0 0 0 1 
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == i || 6 - i == j) {
                    System.err.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.err.println("");
        }

    }
}
