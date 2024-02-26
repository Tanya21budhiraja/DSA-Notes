package Recursion.BasicProblems;

import java.util.Arrays;

public class ReverseArray {
    static void f(int l, int r, int[] arr) {
        if (l > r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        f(l + 1, r - 1, arr);

    }

    static void f1(int i, int[] arr) {
        int n = arr.length;
        if (i > n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        f1(i + 1, arr);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        // f(0, arr.length - 1, arr);
        // System.out.println(Arrays.toString(arr));
        f1(0, arr);
        System.out.println(Arrays.toString(arr));

    }
}
