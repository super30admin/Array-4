// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
 * 1. Sort the array, then add every other element to the result.
 */


import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;

        for(int i=0; i<nums.length; i=i+2){
            result += nums[i];
        }

        return result;
    }
}