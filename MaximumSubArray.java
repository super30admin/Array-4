//o(n) time and o(1) space
//passed all leetcode cases
//used running sum technique
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int rsum = nums[0];
        int globalMax = nums[0];
        for(int i=1;i<n;i++){
            rsum = Math.max(nums[i],rsum+nums[i]);
            globalMax = Math.max(globalMax,rsum);
        }
        return globalMax;

    }
}