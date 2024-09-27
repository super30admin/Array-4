class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || numss.length == 0){
            return 0;
        }
        
        int n = nums.length;
        int maxSum = nums[0];//initializing max sum to nums[0]
        
        //iterating through the array to calculate the sum till that index
        for(int i = 1; i<n ;i++){
            
            //To maximize the sum we need to check if previous sum is greater than 0
            //if so add the prevoious sum to current number and store it
            if(nums[i-1] > 0){
                nums[i] += nums[i-1]; 
            }
            //update the max sum till the index
            maxSum = Math.max(nums[i], maxSum);
        }
        
        // return max sum value
        return maxSum;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)