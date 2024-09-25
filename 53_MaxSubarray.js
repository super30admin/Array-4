/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    var max = nums[0];
    var rSum = nums[0];
    var start = 0;
    var maxStart = 0;
    var maxEnd = 0;
    for(let i = 1; i < nums.length; i++){
        if(rSum + nums[i] > nums[i]){
            rSum = rSum + nums[i]
        }else{
            start = i;
            rSum = nums[i]
        }
        if(max < rSum){
            maxStart = start;
            maxEnd = i;
            max = rSum
        }
    }
   // to know indices of subarray
   console.log(maxStart,maxEnd)
    return max;
};