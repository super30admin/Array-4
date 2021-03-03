// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

// Your code here along with comments explaining your approach
public class MaximumSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            if(nums.length ==1 ) return nums[0];//base case return value in element if array length is 1

            //initialize maxsum and currentsum to nums[0]
            int maxSum = nums[0];
            int currentSum = maxSum;

            //iterate over array
            for (int i = 1; i < nums.length; i++) {
                currentSum = Math.max(nums[i] + currentSum, nums[i]);//determine max value between nums[i]+currentsum or nums[i] to currentsum
                maxSum = Math.max(maxSum, currentSum);//determine max value between maxsum and currentsum and assugn it to maxsum
            }
            return maxSum;//return maxsum
        }
    }


}
