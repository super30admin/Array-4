class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=nums[0],sum=nums[0];
        for(int i=1;i<n;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            max=Math.max(sum,max);
        }
        return max;
    }
}
