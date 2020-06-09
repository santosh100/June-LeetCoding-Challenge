class Solution {
    public int change(int amount, int[] coins) {
                
        // Hint: Refer knapsack
        Arrays.sort(coins);
        int m = coins.length;
        int n = amount;
        int dp[][] = new int[m+1][n+1];
        
        for(int i=0; i<=m; i++)
            dp[i][0] = 1;
        
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i > j || coins[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
                }
            }
        }
        return dp[m][n];
    }
}