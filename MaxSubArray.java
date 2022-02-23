// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int max = nums[0];
        int rSum = nums[0];

        for(int i=1 ; i < nums.length; i++){
            //Add next ele to rSum only if it brings value to current rSum
            rSum = Math.max(rSum + nums[i], nums[i]);
            max = Math.max(rSum,max);
        }
        return max;
    }
}
