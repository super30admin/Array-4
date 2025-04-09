// TC: O(nlogn)
// SC: O(logn)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        
        if (nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }
        if (nums.length < 2) {
            return 0;
        }
        
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
