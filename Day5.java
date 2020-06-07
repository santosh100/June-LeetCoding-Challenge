class Solution {

     int[] prefixsum;
     int n;
     Random rand;
    
    public Solution(int[] w) {
        n = w.length;
        prefixsum = new int[n];
        rand = new Random();
        prefixsum[0] = w[0];
        for (int i = 1; i < n; i++){ 
            prefixsum[i] = prefixsum[i - 1] + w[i];
        }
    }
    
    public int pickIndex() {
        int num = rand.nextInt(prefixsum[n - 1]) + 1;
        int i = Arrays.binarySearch(prefixsum, num);
        if (i < 0){
            i = -(i + 1);
        }
        return i;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */