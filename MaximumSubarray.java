//Time Complexity: O(n)
//Space Complexity: O(1)

/*
 * here we maintain a current sum while traversing through the 
 * array along with a result which keeps track of the maximum sum.
 * current sum is either of current subarray or the current number.
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int result = currSum;
        int n = nums.length;

        for(int i = 1; i < n; i++){
            currSum = Math.max(currSum+nums[i], nums[i]);
            result = Math.max(currSum, result);
        }

        return result;
    }
}