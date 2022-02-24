// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }

    public static int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        int currentSum = nums[0];
        int totalSum = nums[0];

        for(int i=1; i<nums.length; i++){  // T.C - O(N), S.C - O(1)
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            totalSum = Math.max(currentSum, totalSum);
        }

        return totalSum;
    }
}

