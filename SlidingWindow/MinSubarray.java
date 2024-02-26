package SlidingWindow;

public class MinSubarray {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int maxLength = n + 1;
        int sum = 0;

        while (j < n) {
            sum += nums[j];

            while (sum >= target) {
                maxLength = Math.min(maxLength, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return maxLength == n + 1 ? 0 : maxLength;

    }
}
