package Recursion.OnSubsequence;

import java.util.ArrayList;

public class AllSubsequence {
    // a continous / non-continuous subsequence but in order
    // [3 1 2] = [3] , [1] , [2] , [3,1] , [1,2] , [3,1,2] , [3,2]

    // pick and non pick approach
    static void f(int[] arr, ArrayList<Integer> ar, int index) {
        if (index == arr.length) {
            System.out.println(ar);
            return;
        }

        ar.add(arr[index]);
        f(arr, ar, index + 1);
        ar.remove(ar.size() - 1);
        f(arr, ar, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 3 };
        f(arr, new ArrayList<>(), 0);

    }

}
