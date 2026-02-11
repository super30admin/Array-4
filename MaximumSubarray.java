// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Calculate max sum ending at each index in max End and result max sum in res
// if maxEnd contributes negatively to the res, reset the start of the new res from index i -> meaning we start a new subarray from index i
// if maxEnd is greater than res, update res and end

class Solution {
    public int maxSubArray(int[] nums) {
        int maxEnd = nums[0];
        int res = nums[0];

        int start = 0;
        int end = 0;
        int temp = start;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxEnd + nums[i])
                temp = i;
            maxEnd = Math.max(nums[i], maxEnd + nums[i]);
            if (maxEnd > res) {
                start = temp;
                end = i;
            }
            res = Math.max(res, maxEnd);
        }

        System.out.println(start + " , " + end);
        return res;
    }
}