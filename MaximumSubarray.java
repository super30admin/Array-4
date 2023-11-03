// # Time Complexity:  O(n) where n is the length of nums
// #  Space Complexity:  O(1) 
// #  Did this code successfully run on Leetcode : Yes
// #  Any problem you faced while coding this : No
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int rSum = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            rSum = Math.max(nums[i], rSum + nums[i]);
            max = Math.max(max, rSum);
        }
        return max; 
    }
}
