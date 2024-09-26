// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    if (!nums || !nums.length) return 0;
    
    let currSum = nums[0],
        max = nums[0];
    
    for (let i = 1; i < nums.length; i++) {
        currSum = Math.max(currSum + nums[i], nums[i]);
        max = Math.max(max, currSum);
    }
    return max;
};
