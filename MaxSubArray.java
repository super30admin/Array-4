// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : At each element check if adding current element to res increases the res value or just start new subarray at ith index
/// Simultanously maintain a max variable to keep track to maximum res seen so far
class Solution {
    public int maxSubArray(int[] nums) {
        int res =0, max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            res = Math.max(res+nums[i], nums[i]);
            max = Math.max(max, res);
        }
        return max;
    }
}