// Time complexity - O(n^2)
// Space complexity - O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int sum = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length; i++){
            int s = nums[i];
            sum = Math.max(sum, s);
            for(int j = i+1; j < nums.length; j++){
                 s += nums[j];
                sum = Math.max(sum, s);
            }
        }
        return sum;
    }
}
