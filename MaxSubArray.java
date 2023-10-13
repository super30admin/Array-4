//TC:O(N)
//SC:O(N)
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
        if(nums.length==0){
            return Integer.MIN_VALUE;
        }
        if(nums.length==1){
            return nums[0];
        }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int max=dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=nums[i]+(dp[i-1]>0?dp[i-1]:0);
            max=Math.max(max,dp[i]);
        }
        return max;
    }
} 