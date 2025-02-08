// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int maxx = Integer.MIN_VALUE;

        for (int num : nums) {
            curr = Math.max(curr + num, num);
            maxx = Math.max(maxx, curr);
        }
        return maxx;
    }
}