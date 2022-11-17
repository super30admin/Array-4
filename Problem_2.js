// Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function (nums) {
    if (nums === null || nums.length === 0)
        return 0;

    let max = nums[0];
    let rsum = nums[0];
    let n = nums.length;
    for (let i = 1; i < n; i++) {
        // Choose max from, starting new subarray or add to curr subarray
        rsum = Math.max(rsum + nums[i], nums[i]);
        // Take max
        max = Math.max(max, rsum);
    }
    return max;
};