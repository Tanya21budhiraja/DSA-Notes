package Recursion.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Approach2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> ls = permute(nums);
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();

        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(0, nums, ans);
        return ans;

    }

    public static void permutations(int ind, int[] nums, List<List<Integer>> ans) {
        if (ind == nums.length) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = ind; i < nums.length; i++) {
            swap(i, ind, nums);
            permutations(ind + 1, nums, ans);
            swap(i, ind, nums);

        }

    }

    public static void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
