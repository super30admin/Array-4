class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int cur = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            cur = Math.max(cur+nums[i],nums[i]);
            max= Math.max(max,cur);
        }
        return max;
    }
}

//tc: O(n), where n is the length of the array
//sc: O(1)