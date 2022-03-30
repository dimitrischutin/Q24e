package Array;

import java.util.Random;

public class Array_4 {

    public static void main(String[] args) {
        int[][] array = fillArray(5, 7);
        printArray(array);
        System.out.println("----------------------");
        System.out.println(getColumnSum(array, 6));
    }

    public static int getColumnSum(int[][] arr, int columnIndex) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][columnIndex];
        }
        return sum;
    }

    public static int[][] fillArray(int n, int m) {
        int min = -0;
        int max = 10;
        Random random = new Random(System.currentTimeMillis());
        int[][] result = new int[n][m];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return result;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
