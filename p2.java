// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach


class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int currsum = nums[0];
        //Go through all the elements and find if current number is greater or the sum of current number and previous subarray is greater
        for(int i=1; i<nums.length;i++){
            currsum = Math.max(currsum+nums[i], nums[i]);
            sum = Math.max(sum,currsum);
        }
        return sum;
    }
}