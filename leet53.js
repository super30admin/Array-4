TC - O(N)
SC - O(1) 
/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    var sum = nums[0];
    var max = nums[0];
    for(let i=1;i<nums.length;i++)
    {
        sum = Math.max(nums[i],sum+nums[i]);
        max = Math.max(sum,max);
    }
    return max;
};