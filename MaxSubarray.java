// O(n) time: n length of nums
// O(1) space: only 2 variables

class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize starting variables
        int currSubarray = nums[0];
        int maxSubarray = nums[0];
        
        for (int i = 1; i < nums.length; i++){
            int num = nums[i];
            currSubarray = Math.max(num, currSubarray + num); // choose to continue (currSubarray + num) or restart subarray (just num)
            maxSubarray = Math.max(maxSubarray, currSubarray); // track max subarray so far
        }
        return maxSubarray;
    }
}