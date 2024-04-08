class Solution {
    public int maxSubArray(int[] nums) {
        return helper(nums);
    }

    //Tc: O(n)
    //Sc: O(1)
    public int helper(int[] nums) {
        int s=0,max=nums[0];
        for(int i=0 ; i<nums.length ; i++){
            s+=nums[i];
            max = Math.max(s, max);
            if(s<0)
                s=0;
        }
        return max;
    }
}