/* 
    Time Complexity - O(n) where n is the number of elements in nums.
    Space Complexity - O(1)
 */
class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        int maxSum = nums[0], prev = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prev = Math.max(nums[i], prev + nums[i]);
            maxSum = Math.max(maxSum, prev);
        }
        return maxSum;
    }
}
