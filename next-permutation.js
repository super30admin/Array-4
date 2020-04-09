// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(nums) {
    if (!nums || !nums.length || nums.length == 1) return;
    
    const reverse = (start, end) => {
        while (start < end) {
            [nums[start++], nums[end--]] = [nums[end], nums[start]];
        }
    }

    let i = nums.length - 2,
        j = nums.length - 1;
    
    while (nums[i] >= nums[i + 1]) {
        i--;
        if (i == -1) return reverse(0, nums.length - 1);
    }
    
    while (nums[j] <= nums[i]) {
        j--;
    }

    [nums[i], nums[j]] = [nums[j], nums[i]];
    reverse(i + 1, nums.length - 1);
};
