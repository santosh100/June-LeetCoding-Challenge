class Solution {
    public boolean isPowerOfTwo(int n) {
        
        // Approach -1
        // Accepted
        /*
        long pow = 0;
        for(int i=0; pow<=n; i++){
            pow = (long)Math.pow(2,i);
            if(pow == n)
                return true;
        }
        return false;
        */
        
        
        
        // Approach - 2 Bit count (NOTE: there is always only one 1s in power of 2)
        // Time complexity: O(1)
        //return n>0 && Integer.bitCount(n)==1;
        
        // Approach - 3 Bit Manipulation
        // Time complexity: O(1)
        return n > 0 && (n & (n-1)) == 0;
                
    }
}