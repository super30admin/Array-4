class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, temp = 0;
        if(nums.length==1)
            return nums[0];
    for (int i = 0; i < nums.length; i++) {
        temp = Math.max(nums[i], nums[i] + temp);
        max = Math.max(temp, max);
    }
        return max;
    }
}
