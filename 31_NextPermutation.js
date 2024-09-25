/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(nums) {
    var n = nums.length
    var i = nums.length-2; 

    // find first decreasing element from the right
    while(i >= 0 && nums[i] >= nums[i+1]){
        i -= 1;
    }

    //If we found a decreasing element, find the next larger element then that element
    if(i != -1){
        var j = n-1;
        while(nums[j]<= nums[i]){
            j -= 1;
        }
        // swap that two number
        swap(nums,i,j)
    }

    // now reverse
    reverse(nums,i+1,n-1)
};
var reverse = function(nums,start,end){
    while(start <= end){
        swap(nums,start,end)
        start += 1;
        end -=1;
    }
}

var swap = function(nums,i,j){
    var temp = nums[i];
    nums[i] = nums[j]
    nums[j] = temp
}