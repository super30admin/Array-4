TC - O(NlogN)
SC - O(1)

/**
 * @param {number[]} nums
 * @return {number}
 */
var arrayPairSum = function(nums) {
    var sum=0;
    nums.sort((a,b)=>a-b);
    for(var i=0;i<nums.length;i+=2)
    {
        sum+=nums[i];
    }
    return sum;
};