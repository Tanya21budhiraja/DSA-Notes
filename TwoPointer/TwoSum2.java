package TwoPointer;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {

        // In an interview, whenever you're given a question where the input array is
        // sorted,
        // here are some super useful things to consider:

        // Binary Search
        // Two (or three) pointers
        // A sliding window
        // Traversing from the right

        // we will use two pointer
        // one at the begining other at end
        // as it is sorted if target is > than result (right --)
        // if target < result (left ++)

        int left = 0;
        int right = numbers.length - 1;
        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { left + 1, right + 1 };

    }
}
