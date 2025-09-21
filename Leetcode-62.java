class Solution {
    public int helper(int m, int n, int i, int j, int[][] dp){
        if(i>=m || j>=n) return -1;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=0) return dp[i][j];

        int down = helper(m, n, i+1, j, dp);
        int right = helper(m, n, i, j+1, dp);
        if(down==-1) return dp[i][j] = right;
        else if (right == -1) return dp[i][j] = down;
        else return dp[i][j] = down+right;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        return helper(m, n, 0, 0, dp);
    }
    //optimized approach
    public int uniquePaths1(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        dp[m-1][n-1]=1;
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(i==m-1 && j==n-1) continue;
                dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}