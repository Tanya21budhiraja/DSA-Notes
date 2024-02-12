package Array;

public class Stock2 {
    public int maxProfit(int[] prices) {
        // diff from old stock question as in this you can sell more than one time

        int n = prices.length;
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
}
