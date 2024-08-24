// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize maxSum with the first element of the array
        int maxSum = nums[0];
        
        // Variable to keep track of the current sum of the subarray
        int currentSum = 0;
        
        // Variables to track the starting and ending indices of the max subarray
        int start = 0;
        int end = 0;
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If currentSum is zero, start a new subarray at index i
            if (currentSum == 0) start = i;
            
            // Add the current element to currentSum
            currentSum += nums[i];
            
            // Update maxSum if the currentSum is greater than the previous maxSum
            if (currentSum > maxSum) {
                end = i;            // Update the end index of the subarray
                maxSum = currentSum; // Update maxSum to the new maximum
            }
            
            // If currentSum becomes negative, reset it to zero
            // This means we start a new subarray from the next element
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        // Print the starting and ending indices of the maximum subarray
        System.out.println(start);
        System.out.println(end);
        
        // Return the maximum sum found
        return maxSum;
    }
}
