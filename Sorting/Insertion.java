package Sorting;

import java.util.Arrays;

public class Insertion {
    // Sorting the Arrays partially
    // For every index put the element at right position at lhs

    // 5 4 3 2 1
    // 4 5 3 2 1
    // 4 3 5 2 1
    // 3 4 5 2 1
    // 2 3 4 5 1
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
