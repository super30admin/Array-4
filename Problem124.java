//TC: O(n)
//SC: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize with the first element
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update maxCurrent to be the maximum of current element or current element + maxCurrent
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            // Update maxGlobal if maxCurrent is greater
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }
        
        return maxGlobal;
    }
}
