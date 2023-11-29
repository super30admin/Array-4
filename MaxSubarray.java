// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];
        for(int i=1;i<nums.length;i++){
            currentSubarray = Math.max(currentSubarray+nums[i], nums[i]);
            maxSubarray = Math.max(currentSubarray, maxSubarray);
        }
        return maxSubarray;
    }
}