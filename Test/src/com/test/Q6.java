package com.test;
import java.util.*;
class ArrayOperation {
    int[] arr;

    void setArray(int[] array) {
        arr = array;
    }
} 
class CeilFloor extends ArrayOperation {
    void findCeilFloor(int number) {
        int ceil = -1;
        int floor = -1;

        for(int value : super.arr) {
            if(value >= number) {
                if(ceil==-1||value<ceil){
                    ceil = value;
                }
            }
            if(value <= number) {
                if(floor==-1||value>floor){
                    floor = value;
                }
            }
        }
        System.out.println("Number: " + number + " ceiling is: " + ceil + " floor is: " + floor);
    }
}
class Matrix extends ArrayOperation {

    void secondMaxInColumns(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > firstMax) {
                    secondMax = firstMax;
                    firstMax = matrix[i][j];
                } else if (matrix[i][j] > secondMax && matrix[i][j] != firstMax) {
                    secondMax = matrix[i][j];
                }
            }

            System.out.println("Second max in column " + (j + 1) + ": " + secondMax);
        }
    }
}


public class Q6 {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		ArrayOperation ap = new ArrayOperation();
		
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ap.setArray(arr);
		
		CeilFloor c = new CeilFloor();
		for(int i=0 ; i<=10 ; i++) {
			c.findCeilFloor(i);
		}
		
		System.out.println("Enter the new matrix of 9 elemnt:");
		int mat[][]= new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				mat[i][j]=sc.nextInt();
			}	
		}
		Matrix m = new Matrix();
		m.secondMaxInColumns(mat);
		
	}
}
