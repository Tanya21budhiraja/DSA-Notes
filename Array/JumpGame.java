package Array;

public class JumpGame {
    public boolean canJump(int[] nums) {
        // lastindex= length-1
        // check from lastindex-1 to 0
        // peeche se first tak jana h
        // if index+ val[index] >= last
        // then switch lastindex

        // last == 4;
        // 3+1 >= 4;
        // last == 3;

        int n = nums.length - 1;
        int lastindex = n;
        for (int i = n - 1; i >= 0; i--) {
            if (i + nums[i] >= lastindex) {
                lastindex = i;
            }
        }
        return lastindex == 0;

    }
}
