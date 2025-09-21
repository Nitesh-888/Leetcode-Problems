class Solution {
    //time and space is O(n)
    public int helper(int[] prices, int fee, int i, int haveStock, int[][] dp){
        if(i>=prices.length) return 0;
        if(dp[i][haveStock]!=0) return dp[i][haveStock];
        if(haveStock==1){
            int sell = prices[i]-fee+helper(prices, fee, i+1, 0, dp);
            int hold = helper(prices, fee, i+1, 1, dp);
            return dp[i][haveStock]=Math.max(sell, hold);
        }else{
            int buy = -prices[i]+helper(prices, fee, i+1, 1, dp);
            int skip = helper(prices, fee, i+1, 0, dp);
            return dp[i][haveStock]=Math.max(buy, skip);
        }
    }
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        return helper(prices, fee, 0, 0, dp);
    }

    // time O(n) space O(1);
}