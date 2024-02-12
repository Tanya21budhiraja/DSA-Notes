package Array;

public class Stock {
    public int maxProfit(int[] prices) {
        // profit can only be made when prices[sell] > prices[buy]
        // 1) let peices[0] as min
        // 2) profit initially = 0
        // 3) then loop through array
        // 4) update min by checking minimum and cuurrent index
        // 5) proft per index is prices[i]- min
        // 6) update profit by using math.max to find max profit
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;

    }

}
