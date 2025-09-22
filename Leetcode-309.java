class Solution {
    public int helper(int[] prices, int i, int haveStock, int[][] dp){
        if(i>=prices.length) return 0;
        if(dp[i][haveStock]!=0) return dp[i][haveStock];
        if(haveStock==1){
            int sell = prices[i] + helper(prices, i+2, 0, dp);
            int hold = helper(prices, i+1, 1, dp);
            return dp[i][haveStock] = Math.max(sell, hold);
        }else{
            int buy = -prices[i] + helper(prices, i+1, 1, dp);
            int skip = helper(prices, i+1, 0, dp);
            return dp[i][haveStock] = Math.max(buy, skip);
        }
    }
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length][2];
        return helper(prices, 0, 0, dp);
    }
}