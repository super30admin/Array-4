// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this :no

/*
Aprroach we maintain the two vars one to keep track of the max is a rolling manner
another is to keep track of max to rolling num
at each itteration we will check with cur num is bigger or the rsum + cur number is bigger
and check if cur sum is bigger or rsum is bigger

in the end we will return sum
*/

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int rsum = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            rsum = Math.max(nums[i], rsum + nums[i]);
            sum = Math.max(sum, rsum);
        }
        return sum;

    }
}