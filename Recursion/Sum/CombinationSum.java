package Recursion.Sum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> ls = combinationSums(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();

        }
    }

    public static List<List<Integer>> combinationSums(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combine(0, arr, target, ans, new ArrayList<>());
        return ans;

    }

    public static void combine(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> list) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if (arr[ind] <= target) {
            list.add(arr[ind]);
            combine(ind, arr, target - arr[ind], ans, list);
            list.remove(list.size() - 1);
        }
        combine(ind + 1, arr, target, ans, list);
    }
}
