package Array;

public class TrappingRain {
    class Solution {
        // find left max for all the indices
        // find right max also
        public int trap(int[] height) {
            int target = 0;
            int n = height.length;
            int[] left = new int[n];
            left[0] = height[0];
            int[] right = new int[n];
            right[n - 1] = height[n - 1];

            // [0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]
            for (int a = 1; a < n; a++) {
                left[a] = Math.max(height[a], left[a - 1]);
            }
            for (int b = n - 2; b >= 0; b--) {
                right[b] = Math.max(height[b], right[b + 1]);
            }

            for (int i = 0; i < height.length; i++) {
                target += Math.min(left[i], right[i]) - height[i];
            }
            return target;

        }

        public int trapOptimal(int[] height) {
            // OPTIMAL SPACE ONE
            // using two pointer approach for space optimisation
            // left = 0
            // right = n-1
            // leftmax && rightmax
            // [[[ then check if height[left] <= heightp[right] && >= leftmax ]]]
            // if the above works then only update leftmax

            // IMP { ab right bada h left se and leftmax se choti height milgi hame to
            // yha pani bhrjega}
            // [[[ (add height) - (the height jispe aap ho === pani)]]]

            // same for right side

            int left = 0;
            int right = height.length - 1;
            int leftmax = 0;
            int rightmax = 0;
            int pani = 0;

            while (left <= right) {
                if (height[left] <= height[right]) {
                    if (height[left] >= leftmax) {
                        leftmax = height[left];
                    } else {
                        pani += leftmax - height[left];
                    }
                    left++;
                } else {
                    if (height[right] >= rightmax) {
                        rightmax = height[right];
                    } else {
                        pani += rightmax - height[right];
                    }
                    right--;
                }
            }
            return pani;

        }
    }
}
