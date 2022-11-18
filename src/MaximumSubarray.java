// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class MaximumSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int sum =0;
            int maxSum =-999999999;
            for(int i=0; i<nums.length; i++) {
                sum = sum + nums[i];
                if(sum < nums[i]){
                    sum = nums[i];
                }
                if(maxSum< sum ){
                    maxSum = sum;
                }
            }
            return maxSum;
        }
    }
}
