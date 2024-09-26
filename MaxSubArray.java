//Using rsum to find subarray

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null)
            return 0;
        
        int rsum = nums[0];
        int max = nums[0];
        
        for(int i=0; i<nums.length; i++){
            rsum = Math.max(rsum + nums[i], nums[i]);
            max = Math.max(max, rsum);
        }
        return max;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)