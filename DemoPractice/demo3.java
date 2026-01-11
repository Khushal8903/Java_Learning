
public class demo3 {

    public static void main(String[] args) {
        /*
        1     
      A   B    
    2       3   
  B           C    
4   5   6   7   8
         */
        int k = 1;
        int a = 66;
        for (int i = 1; i <= 5; i++) {
          if(i%2==0){
            a--;
          }
            for (int j = 1; j <= 9; j++) {
                if (i % 2 != 0 && (6 - i == j || 4 + i == j)) {
                    System.out.print(k++);
                } else if (i % 2 == 0 && (6 - i == j || 4 + i == j)) {
                    System.out.print((char)a);
                    ++a;
                } else if (i == 5 && j % 2 != 0) {
                    System.out.print(k++);
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }
}
