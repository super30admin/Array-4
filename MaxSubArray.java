// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class MaxSubArray {
    class Solution {
        public int maxSubArray(int[] nums) {

            // int curSum = 0, maxSum = Integer.MIN_VALUE;

            // for(int num : nums){
            //     curSum += num;
            //     if(curSum > maxSum)
            //         maxSum = curSum;
            //     if(curSum < 0)
            //         curSum = 0;
            // }
            // return maxSum;

            int n = nums.length;
            if(n == 0)
                return 0;

            int max = nums[0];
            int curr = nums[0];

            int start = 0, end = 0;

            for(int i = 1; i < n; i++){
                if(nums[i] > curr+nums[i]){
                    curr = nums[i];
                    start = i;
                }
                else{
                    curr = curr+nums[i];
                }
                if(curr > max){
                    max = curr;
                    end = i;
                }
            }
            //System.out.println("s: "+start+"\ne: "+end);
            return max;
        }
    }
}
