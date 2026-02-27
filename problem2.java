/*
Time Complexity : O(N)

Space Complexity : O(1)
Explanation:
Only two variables (currsum and maxsum) are used.

Did this code successfully run on LeetCode : Yes

Any problem you faced while coding this :
Initially tried using nested loops which resulted in O(N^2) time.
Later understood Kadane’s Algorithm where:
currsum = max(current element, current element + previous sum)
This ensures we always keep the best subarray ending at current index.
*/

class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < n; i++) {

            // Decide whether to start new subarray or extend existing
            currsum = Math.max(nums[i], currsum + nums[i]);

            // Update global maximum
            maxsum = Math.max(maxsum, currsum);
        }

        return maxsum;
    }
}