// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

// As iterate over the array, we update the following
// Running maximum - rmax ending at that index as max(rmax + nums[i], nums[i])
// Maximum Subarray Sum - max as maximum of max and rmax 


class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int rmax = nums[0], max = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            rmax = Math.max(rmax + nums[i], nums[i]);
            max = Math.max(max, rmax);
        }
        return max;
    }
}
