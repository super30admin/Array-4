// Time Complexity : O(n) --> where n is the length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (53): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        //edge case
        if (nums == null || nums.length == 0) return 0;
        
        int globalSum = nums[0];
        int localSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            localSum = Math.max(localSum + nums[i], nums[i]);
            globalSum = Math.max(globalSum, localSum);
        }
        return globalSum;
    }
}