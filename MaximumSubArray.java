// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


//Your code here along with comments explaining your approach
// Maintain a running sum.
// CurSum = Max( curSum + nums[i] , or nums[i]) number by itself
// Keep a track of max and return max

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null) return 0;


        int max = nums[0];
        int curSum = nums[0];


        for(int i =1; i < nums.length; i++) {

            curSum = Math.max(nums[i], curSum + nums[i]);
            max = Math.max(max, curSum);

        }
        return max;
    }
}
