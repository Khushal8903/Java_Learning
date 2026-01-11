
public class demo5 {

    public static void main(String[] args) {
        /*
    Write a java program to take input array from user and perform this operations in array. 
Input Array :  5732  8659  2534  9625  7354  1325 
Explanation : Store sum of digits at same index. 
Output :-  17  28  14  22  19  11
         */

        int arr[] = {5732, 8659, 2534, 9625, 7354, 1325};
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int sum = 0;
            while (temp != 0) {
                sum = sum + temp % 10;
                temp /= 10;
            }
            arr1[i] = sum;
        }
        for (int k : arr1) {
            System.out.println(k);
        }
    }
}
