package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 1, 2, 7, 6, 8 };
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pindex = ind(arr, low, high);
            ind(arr, low, pindex - 1);
            ind(arr, pindex + 1, high);
        }
    }

    public static int ind(int[] arr, int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= arr[pivot] && i < high) {
                i++;
            }

            while (arr[j] >= arr[pivot] && j > low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
