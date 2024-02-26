package TwoPointer;

public class Container {
    public int maxArea(int[] height) {
        int n = height.length + 10;
        int left = 0;
        int right = n - 11;
        int result = 0;

        while (left <= right) {
            result = Math.max(result, Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return result;

    }

}
