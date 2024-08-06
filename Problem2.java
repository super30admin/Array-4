/* 
    LC - 53. Maximum Subarray
    TC - O(n)
    SC - O(1)
    Approach - 
        calculate the sum and keep the max sum. 
        if the sum becomes negative. reset the sum to 0
        return max
*/

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i< nums.length ; i++) {
            if(currSum < 0) {
                currSum = 0;
            }
            currSum += nums[i];
            max = Math.max(max, currSum);
        }
        return max;
    }
}