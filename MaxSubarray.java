class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int result=0;
        int currSubArrSum=nums[0];
        int maxSubArrSum=nums[0];
        
        
        for(int i=1;i<n;i++){
            currSubArrSum=Math.max(nums[i],currSubArrSum+nums[i]);
            maxSubArrSum=Math.max(maxSubArrSum,currSubArrSum);
        }
        
        return maxSubArrSum;
    }
}