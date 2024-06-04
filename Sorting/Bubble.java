package Sorting;

import java.util.Arrays;

public class Bubble {
    // Compare adjacent elements in each pass
    // Largest element is bubbled upto last position in each pass
    // Space Complexity = O(1)
    // Time Complexity = O(n^2)

    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 3 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}