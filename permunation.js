// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(nums) {
    if(nums == null || nums.length == 0) return;
    //step 1 - find the breach
    let n = nums.length
    let i = n - 2
    while(i >= 0 && nums[i] >= nums[i+1]){
        i--
    }
    
    //finite value of i or -1
    //step 2;
    if(i >= 0){
        let j = n - 1;
        while(nums[i] >= nums[j]){
            j--;
        }
        
        swap(nums,i, j)
    }
    
    reverse(nums, i + 1, n-1);
    
    function reverse(mnums, left, right){
        while(left < right){
            swap(nums, left, right)
            left++, right--
        }
    }
    
    function swap(nums, i, j){
        let temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp
    }
};
