package Array;

public class Product {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int product = 1;
        for (int i : nums) {
            product *= i;

        }
        // total product nikala
        // then divide it by each number
        for (int i = 0; i < n; i++) {
            ans[i] = product / nums[i];
        }
        return ans;

    }
}
