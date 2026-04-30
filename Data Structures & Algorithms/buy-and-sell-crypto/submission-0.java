// [10, 1, 5, 6, 7, 1] -> 6
// [10, 8, 7, 4] -> 0
// [1] -> 0
// approach:
// 1. brute force
// we fix the current day as the buy day and count each next day as the sell day and update the profit
// TC: O(n^2), SC: O(1)
// 2. optimal
// fix the current day as the buy day and if the next day the price goes down 
// then it means that it's not optimal to buy a stock in this day,
// so we change the buy day to tomorrow
// TC: O(n), SC: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = -buy;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
                profit = -buy;
            } else {
                profit = prices[i] - buy;
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
