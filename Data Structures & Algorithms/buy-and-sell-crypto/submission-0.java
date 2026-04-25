class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, i, currMax = prices[prices.length-1];
        for(i=prices.length-2;i>=0;i--){
            profit = Math.max(profit, currMax - prices[i]);
            currMax = Math.max(currMax, prices[i]);
        }
        return profit;
    }
}
