public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(nums==null || n<0) return 0;
        int currSum = nums[0];
        int max = nums[0];
        for(int i=1;i<n;i++){
            currSum = Math.max(currSum+nums[i], nums[i]);
            max = Math.max(max,currSum);
        }
        return max;
    }  
}

// Time Complexity - O(n)
// Space Complexity - O(1)