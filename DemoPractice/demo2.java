
public class demo2 {

    public static void main(String x[]) {
        int i = 123456;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (i != 0) {
            int j = i % 10;
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
			i/=10;
        }
        System.err.println(min);
        System.err.println(max);
    }

}
