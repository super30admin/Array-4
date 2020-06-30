//leetcode: 53. Maximum Subarray
//Time cOmplexity: O(n)
//Space CComplexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int max= nums[0];
        int lsum=nums[0];
        for(int i=1;i<nums.length;i++){
            lsum= Math.max(lsum+nums[i], nums[i]);
            max= Math.max(lsum,max);
        }
        return max;
    }
}