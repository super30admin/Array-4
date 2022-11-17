// Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// TC: O(n)
// SC: O(1)

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function (nums) {
    if (nums === null || nums.length === 0)
        return;
    let index = -1;
    let n = nums.length;
    // Find breach, prev < curr. Set prev as index
    for (let i = n - 2; i >= 0; i--) {
        if (nums[i] < nums[i + 1]) {
            index = i;
            break;
        }
    }
    // Find next greater in right array if index is not -1;
    if (index >= 0) {
        for (let i = n - 1; i >= index; i--) {
            if (nums[i] > nums[index]) {
                // Swap
                let temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }
    }
    // Reverse other half
    let i = index + 1;
    let j = n - 1;
    while (i < j) {
        let temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }
};