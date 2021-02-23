// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// keep adding number if previous sum is greater than 0 else start from current number.
// at each step compare sum with max and update max.

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0 ) return 0;
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i =0;i< nums.length;i++){
            if(curr>0) curr+=nums[i];
            else curr = nums[i];
            if(max<curr) max = curr;
        }
        return max;
    }
}