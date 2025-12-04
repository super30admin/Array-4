// Time Complexity : O(n log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : We first sort the array, so that the minimum of each pairs will be at even indices starting from 0. We add all of them and return the result.
// This solution is efficient if the elements are having big differences.

class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i += 2){ // consider elements in increments of 2 as it's sorted
            result += nums[i];
        }
        return result;
    }
}