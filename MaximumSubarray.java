class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int rsum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            rsum = Math.max(rsum + nums[i] , nums[i]);
            max = Math.max(max , rsum);
 
        }
        return max;
        
    }
}