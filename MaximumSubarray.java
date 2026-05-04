class Solution {
    // Brute force O(n^2) time, O(1) space
    // public int maxSubArray(int[] nums) {
    //     int maxSum = nums[0];
    //     for (int i = 0; i < nums.length; i++) {
    //         int currSum = 0;
    //         for (int j = i; j < nums.length; j++) {
    //             currSum += nums[j];
    //             maxSum = Math.max(maxSum, currSum);
    //         }
    //     }
    //     return maxSum;
    // }


    // Kadane's algo, O(n) time, O(1) space
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE; // or set to nums[0]
        int currSum = 0;
        for (int num : nums) {
            // if currSum ever negative, we reset to 0 since we     
            // don't  wanna add a negative sum to further elems
            currSum = Math.max(currSum, 0); 
            // if (currSum < 0) {
            //     currSum = 0;     same as above
            // }
            currSum += num;
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}