// Time Complexity :O(N) 
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach: Maintaining the current sum of the continuous array and check if it is
// greater than the present element. Also update max value.
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int csum=0;//Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            csum=Math.max(nums[i],csum+nums[i]);
            if(csum>max)
                max=csum;
        }
        return max;
    }
}