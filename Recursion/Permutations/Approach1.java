package Recursion.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> ls = permute(nums);
        // for (int i = 0; i < ls.size(); i++) {
        // for (int j = 0; j < ls.get(i).size(); j++) {
        // System.out.print(ls.get(i).get(j) + " ");
        // }
        // System.out.println();

        // }

        for (List<Integer> i : ls) {
            System.out.println(i);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutations(nums, ans, new ArrayList<>(), freq);
        return ans;

    }

    public static void permutations(int[] nums, List<List<Integer>> ans, ArrayList<Integer> list, boolean[] freq) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                list.add(nums[i]);
                permutations(nums, ans, list, freq);
                list.remove(list.size() - 1);
                freq[i] = false;
            }
        }
    }
}
