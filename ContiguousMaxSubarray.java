// Time Complexity : O(n) where n is the number of elements in the array
// Space Complexity : O(1) in place 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/* Your code here along with comments explaining your approach: Kadane's algorithm: If the next incoming number increases the running sum to max, then keep
it else if the incoming number in itself is the max between the running sum and itself and individually itself, update the sum. Update
the max at each index.
*/
class Solution {
    public int maxSubArray(int[] nums) {
     if(nums == null || nums.length == 0){return 0;}
        int max = Integer.MIN_VALUE;                                                            // Initialise max
        int sum =0 ;
    for(int i =0; i < nums.length; i++){
        sum = Math.max(nums[i], sum + nums[i]);                                                 // Is the incoming number greater than running sum
        max = Math.max(sum, max);                                                               // Keep the max till now
    }
        return max;
    }
}