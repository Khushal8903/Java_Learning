
public class demo6 {

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 7, 8, 9};

        for (int i = 0; i <= 9; i++) {
            int ceil = Integer.MAX_VALUE;
            int floore = Integer.MIN_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > i && arr[j] < ceil) {
                    ceil = arr[j];
                }

                if (arr[j] < i && arr[j] > floore) {
                    floore = arr[j];
                }

            }
            if (ceil == Integer.MAX_VALUE) {
                ceil = -1;
            }
            if (floore == Integer.MIN_VALUE) {
                floore = -1;
            }
            System.out.println(i + "= Ceil : " + ceil + "Floore :" + floore);
        }
    }
}
