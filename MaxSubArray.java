public class MaxSubArray {
    // Time Complexity :O(n) where n is the number of elements in the nums array
    // Space Complexity :O(1) as no auxiliary space is used
    // Did this code successfully run on Leetcode :yes
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length < 1){
            return 0;
        }
        int left =0, right=0;
        int currSum = nums[0];
        int max = nums[0];
        for(int i=1; i< nums.length; i++){

            currSum = Math.max(nums[i], currSum + nums[i]);
            max = Math.max(currSum, max);
        }
        return max;
    }
}
