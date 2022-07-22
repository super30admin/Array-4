// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/* Maintain running sum and max sum value.
 * Iterate over array and perform following two operations :- 
 *      1. If rsum for current index is less than the current index value then update rsum with that value.
 *      2. If current rsum is greater than max then update max.
 */

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        if (nums.size() == 0)
            return 0;
        
        int rSum = nums[0];
        int maxSum = nums[0];
        
        for (int i = 1; i < nums.size(); i++)
        {
            rSum = max(rSum + nums[i], nums[i]);
            maxSum = max(rSum, maxSum);
        }
        
        return maxSum;
    }
};