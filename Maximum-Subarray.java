//time - O(n), space - O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int rsum = nums[0], maxSum = nums[0];

        for(int i=1; i<nums.length; i++){
            rsum = Math.max(rsum+nums[i], nums[i]);
            maxSum = Math.max(rsum, maxSum);
        }

        return maxSum;
    }
}
