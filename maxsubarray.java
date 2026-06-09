// Time Complexity : O(n) as we traverse the array once
// Space Complexity : O(1) as we are using constant extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We use Kadane's algorithm to find the maximum subarray sum. We keep track of the current sum and update the maximum sum whenever the current sum exceeds it. 
// If the current sum drops below or equal to zero, we reset it to the current element, as a negative or zero sum would not contribute to a maximum sum in future iterations. We also keep track of the starting and ending indices of the maximum subarray for reference, although the problem only asks for the maximum sum. 
// This approach ensures that we find the maximum sum in a single pass through the array, resulting in O(n) time complexity.
// We can also use a divide and conquer approach to achieve O(n log n) time complexity, but Kadane's algorithm is more efficient for this problem.
// The brute force approach would involve checking all possible subarrays and calculating their sums, which would result in O(n^2) time complexity, making it inefficient for large arrays.

class Solution {

    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < nums.length; i++) {

            if (currSum <= 0) {
                currSum = nums[i];
                tempStart = i;
            } else {
                currSum += nums[i];
            }

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }

        return maxSum;
    }
}