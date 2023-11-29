/* Time Complexity : O(n logn)) 
 *  n - len of array - nums */
/* Space Complexity : O(1) */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :


class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        //Sort - MAXimize the MINimum of pairs
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i < n; i = i+2){
            result += nums[i];
        }
        return result;
    }
}