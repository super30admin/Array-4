class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cr = 0;
        for(int i=0;i<nums.length;i++){
            cr = cr + nums[i];
            if(nums[i]>cr){
                cr = nums[i];
            }
            if(max < cr){
                max = cr;
            }
        }
        return max;
        
    }
}