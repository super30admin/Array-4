// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        int greedy = 0;
        int smart = nums[0];

        for(int i=0;i<nums.length;i++) {
            greedy += nums[i];

            if(greedy>smart) {
                smart = greedy;
            }
            if(greedy<0) {
                greedy = 0;
            }
        }

        return smart;
    }
} 