package Array.SubArray;

import java.util.ArrayList;
import java.util.List;

public class SubArrays {

    static List<List<Integer>> findSubarrays(int[] arr) {
        List<List<Integer>> subarrays = new ArrayList<>();
        int n = arr.length;

        // Outer loop for starting index
        for (int i = 0; i < n; i++) {
            // Inner loop for ending index
            for (int j = i; j < n; j++) {
                List<Integer> subarray = new ArrayList<>();
                // Iterate over elements from index i to j
                for (int k = i; k <= j; k++) {
                    subarray.add(arr[k]);
                }
                subarrays.add(subarray);
            }
        }
        return subarrays;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> subarrays = findSubarrays(arr);
        System.out.println("Subarrays of " + java.util.Arrays.toString(arr) + " are:");
        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
}
