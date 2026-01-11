
public class demo4 {

    public static void main(String[] args) {
        /*Q1. Write a program in java to find out the maximum difference between any two elements such that 
larger element appears after the smaller number. 
 Expected Output : 
 The given array is : 7 9 5 6 13 2 
 The elements which provide maximum difference is: 5, 13 
 The Maximum difference between two elements in the array is: 8*/
        int arr[] = {7, 9, 5, 6, 13, 2};
        int mx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
              int sum = arr[j] - arr[i] ;
                if (sum> mx) {
                    mx =sum;
                }
            }
        }
        System.out.println(mx);
    }
}
