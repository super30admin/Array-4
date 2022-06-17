// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int maxSubArray(int[] nums) {
        
        int localSum = 0;
        int result = nums[0];
        
        for(int n: nums) {
            localSum = Math.max(n, n + localSum);
            result = Math.max(result, localSum);
        }
        
        return result;
    }
}