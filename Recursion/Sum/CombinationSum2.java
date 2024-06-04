package Recursion.Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        List<List<Integer>> ls = CombinationSum2.combinationSums2(candidates, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();

        }
    }

    public static List<List<Integer>> combinationSums2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(0, target, candidates, ans, new ArrayList<>());
        return ans;
    }

    public static void sum(int ind, int target, int[] candidates, List<List<Integer>> ans, List<Integer> list) {
        Arrays.sort(candidates);
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = ind; i < candidates.length; i++) {
            if (i > ind && candidates[i] == candidates[i - 1])
                continue;
            if (candidates[i] > target)
                break;

            list.add(candidates[i]);
            sum(i + 1, target - candidates[i], candidates, ans, list);
            list.remove(list.size() - 1);
        }
    }
}
