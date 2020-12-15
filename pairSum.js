// Time Complexity : O(n log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * @param {number[]} nums
 * @return {number}
 */
var arrayPairSum = function(nums) {
    if(nums.length == 0 || nums == null){
        return 0
    }
    let sum = 0;
    nums.sort((a,b) => a-b)
    for(let i = 0; i < nums.length; i+=2){
        sum += nums[i]
    }
    return sum
};