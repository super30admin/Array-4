// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class MaximumSubArray {

    class Solution { //running  sum
        public int maxSubArray(int[] nums) {
            int maxSubArray = nums[0];
            int  globalMaxSubArray = nums[0];

            for(int i=1; i < nums.length; i++) {
                maxSubArray = Math.max(maxSubArray + nums[i], nums[i]);
                if(maxSubArray > globalMaxSubArray)
                    globalMaxSubArray = maxSubArray;
            }

            return globalMaxSubArray;
        }
    }
}
