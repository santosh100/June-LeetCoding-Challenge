class Solution {
    public void sortColors(int[] nums) {
        
        //Approach - 1
        /*
        int zeroCount = 0; 
        int oneCount = 0; 
        int twoCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            }else if(nums[i] == 1){
                oneCount++;
            }else{
                twoCount++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i<zeroCount){
                nums[i] = 0;
            }else if(i<zeroCount + oneCount){
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
        }   
        */
        
        //Approach - 2 
        int left = 0; 
        int cur = 0;
        int right = nums.length-1;
        while(cur <= right){
            if(nums[cur] == 2){
                nums[cur] = nums[right];
                nums[right] = 2;                           
                right--;
            }else if(nums[cur] == 0){
                nums[cur] = nums[left];
                nums[left] = 0;
                cur++;
                left++;
            }else{
                cur++;
            }
        }
    }
}