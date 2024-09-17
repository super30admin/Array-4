// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        //edge
        if(nums == null || nums.length == 0) return 0;
        //get cur and max and set it to the beginning
        int cur = nums[0];
        int max = nums[0];
        //start a for loop to go through the nums array
        for(int i = 1; i < nums.length; i++){
            //set the max cur
            cur = Math.max(cur + nums[i], nums[i]);
            //check max and cur
            max = Math.max(max, cur);
        }
        return max;
    }
}