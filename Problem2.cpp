/* Problem Statement:

VERIFIED ON LEETCODE PLATFORM 
53. Maximum Subarray
Easy

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

 * Solution 1: using dynamic programming 
   Time Complexity : O(n)
 * Space complexity :O(1)
 */

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int len = nums.size();
        int max_sum = 0;
        int curr_sum = 0;
        int idx;
        
        if (len == 0) {
            return max_sum;
        }
        
        max_sum = nums[0];
        curr_sum = nums[0];
        /* store max sum and curr sum */
        for (idx=1;idx < len; idx++) {
            /* update curr_sum as max of the current num or by combining it with previous one */
            curr_sum = max(curr_sum + nums[idx], nums[idx]);
            /* update max sum accordingly */
            max_sum = max(max_sum, curr_sum);
        }
        return max_sum;
    }
};
/* Execute on leetcode platform */


