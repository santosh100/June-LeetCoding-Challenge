class Solution {
    
    //Approach - 1
    // Time Complexity -  O(N) for swapping n/2 times
    // Space Complexity - O(1)
    /*
    public void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }
    */
    
    
    // LEET CODE ~ SOLUTION
    // Time Complexity -  O(N) for swapping n/2 times
    // Space Complexity - O(1)
    
    //Note: faster than Approach 1 (Approach - 1 took 1 ms but this solution took 0)
    
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}