// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]+nums[i-1]> nums[i]) {
                nums[i] = nums[i] + nums[i-1];
            }
            
            max = Math.max(max, nums[i]);
        }
        
        return max;
    }
}
