// Time Complexity : O(NLogN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

// We sort the nums array
// Starting from 0 index, we add every alternative values to a variable sum
// we return sum


class Solution {
    public int arrayPairSum(int[] nums) {
        
        if(nums == null || nums.length == 0) return -1;
        
        Arrays.sort(nums);
        
        int sum = 0;
        
        for(int i = 0; i < nums.length; i += 2) {
            
            sum += nums[i];
        }
        return sum;
    }
}