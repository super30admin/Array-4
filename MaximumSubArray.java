//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code run successfully on leetcode : Yes
//Have you faced any issue while coding this problem : No
class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < nums.length; i++) {
            currSum = Math.max(currSum+nums[i], nums[i]);
            max = Math.max(currSum, max);
        }
        return max;
    }
}