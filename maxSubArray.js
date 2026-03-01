/**
 * @param {number[]} nums
 * @return {number}
 Intuition:
 Traverse the array while keeping a running sum of the current subarray.
 At each step, decide whether to extend the previous subarray or start fresh from the current element.
 Continuously track the maximum sum seen so far to get the largest subarray sum.
 T.C: O(n)
 S.C: O(1)
 */
var maxSubArray = function(nums) {
    let currSum = nums[0];
    let curr = currSum, max = currSum;
    for(let i = 1; i < nums.length; i++){
        curr = nums[i];
        currSum += curr;
        max = Math.max(max, currSum, curr);
        if(currSum < curr){
            currSum = curr;
        }
    }
    return max;
};