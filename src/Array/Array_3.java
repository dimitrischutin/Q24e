package Array;

import java.util.Random;

/*
Implement the method that finds the
row's index in the array int[n][k] of random integers with minimum sum of elements
 */
public class Array_3 {

    public static void main(String[] args) {
        int[][] array = fillArray(5, 3);
        printArray(array);
        System.out.println("-----------------------------");
        System.out.println(getRowIndexWithMinimumSum(array));

    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("  (" + sumElements(array[i]) + ")");

        }
    }

    public static int[][] fillArray(int n, int m) {
        int min = -50;
        int max = 50;
        Random random = new Random(System.currentTimeMillis());
        int[][] result = new int[n][m];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return result;
    }


    public static int sumElements(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static int getRowIndexWithMinimumSum(int[][] array) {
        int min = sumElements(array[0]);
        int indexMinRow = 0;
        for (int i = 1; i < array.length; i++) {
            int sum = sumElements(array[i]);
            if (sum < min) {
                min = sum;
                indexMinRow = i;
            }
        }
        return indexMinRow;
    }


}

