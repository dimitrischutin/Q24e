package Array;

public class Array_1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6};
        System.out.println(sumArray(arr, 0));
    }

    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        } else {
            return arr[index] + sumArray(arr, index + 1);
        }
    }
}