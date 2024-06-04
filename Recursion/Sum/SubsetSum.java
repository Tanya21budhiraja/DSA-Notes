package Recursion.Sum;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
    public static void main(String[] args) {

    }

    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        sum(arr, ans, 0, 0, N);
        Collections.sort(ans);
        return ans;

    }

    public void sum(ArrayList<Integer> arr, ArrayList<Integer> ans, int sum, int ind, int N) {
        if (ind == N) {
            ans.add(sum);
            return;
        }

        sum(arr, ans, sum + arr.get(ind), ind + 1, N);
        sum(arr, ans, sum, ind + 1, N);
    }
}
