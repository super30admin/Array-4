// Time Complexity : O(n) where n is the number of elements in nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int sum = 0;
        int maxSum = nums[0];
        
        for(int num : nums)
        {
            sum = Math.max(num, num + sum);
            maxSum = Math.max(sum, maxSum);
        }
        
        return maxSum;
    }
}