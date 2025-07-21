/*
 * TC: O(n) n: length of nums
 * SC: O(1)
 * 
 * Approach: Iterate thought the array and keep updating my max sum, at each iteration i will have two choice, current element or sum so far + current element
 * i will pick the max among them as my currSum. same for result, choose max from result or currSum.
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int i = 1;
        int n = nums.length;
        int currSum = nums[0];
        int result = nums[0];

        while(i < n){
            currSum = Math.max(currSum+nums[i], nums[i]);
            result = Math.max(result, currSum);
            i++;
        }

    return result;
    }
}