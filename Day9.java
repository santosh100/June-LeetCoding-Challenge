class Solution {
    public boolean isSubsequence(String s, String t) {
        
        // Approach - 1 -> DP
        /*
        int m = s.length(); 
        int n = t.length();
        int dp[][] = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];    
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);                    
                }
            }
        }
        return dp[m][n] == m;
        */
        
        
        // Approach - 2 
        // Faster than Approach - 1 
        int index = -1;
        for (char c : s.toCharArray()){
            index = t.indexOf(c, index + 1);
            if (index == -1)
                return false;
        }
        return true;
        
    }
}