package Array.SubArray;

public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += nums[j];
                max = Math.max(currSum, max);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int a = maxSubArray(nums);
        System.out.println(a);
    }
}
