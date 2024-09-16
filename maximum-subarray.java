// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        //base case
        if(nums == null || nums.length == 0)
            return 0;
        
        int max=Integer.MIN_VALUE, runSum=0;
        for(int i=0;i<nums.length;i++)
        {
            runSum=Math.max(runSum+nums[i], nums[i]);
            max=Math.max(max, runSum);
        }
        return max;
    }
}
