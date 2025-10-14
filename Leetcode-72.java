class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int[][] dp=new int[n1+1][n2+1];
        dp[0][0]=0;
        for(int i=1; i<dp.length; i++){
            dp[i][0]=i;
        }
        
        for(int i=1; i<dp[0].length; i++){
            dp[0][i]=i;
        }
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[i].length; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    //replace
                    dp[i][j]=dp[i-1][j-1];
                    
                    //delete
                    dp[i][j]=Math.min(dp[i][j], dp[i-1][j]);
    
                    //insert
                    dp[i][j]=Math.min(dp[i][j], dp[i][j-1])+1;
                }
            }
        }
        return dp[n1][n2];
    }
}