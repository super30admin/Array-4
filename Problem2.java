//Time = O(n)
//Space = O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize the maximum sum to be the first element
        int currentSum = nums[0]; // Initialize the current sum to be the first element
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]); // Keep track of the current sum
            maxSum = Math.max(maxSum, currentSum); // Update the maximum sum if necessary
        }
        
        return maxSum; // Return the maximum sum
    }
}
