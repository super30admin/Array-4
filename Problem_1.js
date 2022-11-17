// Problem1 Array partition I (https://leetcode.com/problems/array-partition/)

// Time Complexity :O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * @param {number[]} nums
 * @return {number}
 */
var arrayPairSum = function (nums) {
    if (nums === null || nums.length === 0)
        return 0;
    // Sort array
    nums.sort((a, b) => a - b);
    let sum = 0;
    let i = 0;
    let n = nums.length;
    while (i < n) {
        // Consider every 2nd element
        sum += nums[i];
        i += 2;
    }
    return sum;
};