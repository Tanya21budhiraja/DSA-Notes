package Array;

public class Candy {
    public int candy(int[] ratings) {
        // First Pass - Left to Right: Iterate through the ratings array from left to
        // right
        // (from index 1 to n-1), and for each child, check if their rating is higher
        // than
        // the previous child. If it is, assign the number of candies for this child as
        // one more
        // than the previous child's candies.

        // Second Pass - Right to Left: Iterate through the ratings array from right to
        // left
        // (from index n-2 to 0), and for each child, check if their rating is higher
        // than the next child.
        // If it is, update their candies to be the maximum of their current candies and
        // one more
        // than the next child's candies.

        // FOR LINE N0 - 27
        // they are asking minimum no of candies
        // so we have to check if they already have extra candies we will not give them
        // in second iteration

        int[] candy = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++) {
            candy[i] = 1;
        }
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = candy[i + 1] + 1;
            }
        }
        int totcandy = 0;
        for (int i = 0; i < ratings.length; i++) {
            totcandy += candy[i];
        }
        return totcandy;

    }
}
