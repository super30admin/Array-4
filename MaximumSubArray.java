package Array4;
// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            currSum = Math.max(nums[i], nums[i] + currSum);
            max = Math.max(currSum, max);
        }
        return max;
    }
}
