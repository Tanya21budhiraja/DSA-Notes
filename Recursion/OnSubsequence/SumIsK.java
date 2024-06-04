package Recursion.OnSubsequence;

import java.util.*;
// we are covering 3 types of this qestion
// ALL -> printing all the subsequences havinh sum = k
// ONLY ONE -> printing only one subsequenece
// COUNT -> printing the number of subsequeneces

public class SumIsK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int k = 2;
        All(arr, k, 0, new ArrayList<>(), 0);
        One(arr, k, 0, new ArrayList<>(), 0);
        System.out.println(Count(arr, k, 0, new ArrayList<>(), 0));
    }

    public static void All(int[] arr, int k, int i, ArrayList<Integer> temp, int sum) {
        if (i == arr.length) {
            if (sum == k) {
                System.out.println(temp);
                return;
            }
            return;
        }

        temp.add(arr[i]);
        sum += arr[i];
        // pick
        All(arr, k, i + 1, temp, sum);

        temp.remove(temp.size() - 1);
        sum -= arr[i];
        // non pick
        All(arr, k, i + 1, temp, sum);
    }

    public static boolean One(int[] arr, int k, int i, ArrayList<Integer> temp, int sum) {
        if (i == arr.length) {
            if (sum == k) {
                System.out.println(temp);
                return true;
            }
            return false;
        }

        temp.add(arr[i]);
        sum += arr[i];
        if (One(arr, k, i + 1, temp, sum) == true) {
            return true;
        }
        temp.remove(temp.size() - 1);
        sum -= arr[i];
        if (One(arr, k, i + 1, temp, sum) == true) {
            return true;

        }
        return false;
    }

    public static int Count(int[] arr, int k, int i, ArrayList<Integer> temp, int sum) {
        if (i == arr.length) {
            if (sum == k) {
                return 1;

            }
            return 0;
        }
        temp.add(arr[i]);
        sum += arr[i];
        // pick
        int left = Count(arr, k, i + 1, temp, sum);

        temp.remove(temp.size() - 1);
        sum -= arr[i];
        // non pick
        int right = Count(arr, k, i + 1, temp, sum);

        return left + right;

    }
}