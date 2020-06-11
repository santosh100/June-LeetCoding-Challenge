class Solution {
    public int recBinarySearch(int []nums, int left, int right, int target){
        if(left > right){
            return left;
        }
        int mid = left + (right - left)/2;
        if(target > nums[mid])
            return recBinarySearch(nums, mid + 1, right, target);
        else
            return recBinarySearch(nums, left, mid - 1, target);
    }
    public int searchInsert(int[] nums, int target) {
        
        // Approach - 1 Iterative Binary Search
        /*
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target > nums[mid]){
                left = mid + 1;                
            }else{            
                right = mid - 1;                
            }                
        }
        return left;
        */
        
        // Approach - 2 Recursive Binary Search        
        return recBinarySearch(nums, 0, nums.length - 1, target);
    }
}