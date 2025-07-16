/*
Approach : Prefix sum
 [-2,1,-3,4,-1,2,1,-5,4]
1) keep checking max(prevSum + current element ,  current element ) and consider the same for maximum prefixSum
2) keep comparing max and prefixSum too
3) return max
Time Complexity - O(n)
Space Complexity - O(1)
Did this code successfully run on Leetcode :  Yes
Any problem you faced while coding this :  No
*/
public class MaximumSubarray_LC_53 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int rSum = 0;
        for(int i = 0; i < nums.length; i++) {
            rSum = Math.max(rSum + nums[i], nums[i]);
            max = Math.max(max, rSum);
        }
        return max;
    }
}