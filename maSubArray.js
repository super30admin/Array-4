// Time Complexity : O(N)
// Space Complexity : O(1 )
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    if(nums.length == 0 || nums == null) return 0
    let max = nums[0];
    let currMax = nums[0];
    
    for(let i = 1; i < nums.length; i++){
        currMax = Math.max(currMax + nums[i], nums[i]);
        max = Math.max(currMax, max)
    }
    return max
    
};


