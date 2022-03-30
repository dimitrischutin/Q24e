package Array;

import java.util.Random;

public class Array_2 {

    public static void main(String[] args) {
        int[][] array = getNewArray(3, 4, 1, 9);
        print2(array);
        System.out.println("---------------");
        int[] res = getSumOfRows(array);
        print1(res);

    }

    public static int[][] getNewArray(int row, int col, int min, int max) {
        Random random = new Random(System.currentTimeMillis());

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return arr;
    }

    public static void print1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static void print2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] getSumOfRows(int[][] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = sumArray(arr[i]);
        }
        return res;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
