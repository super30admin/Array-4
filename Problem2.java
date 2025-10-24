// Time Complexity : O(n) where n is the number of items in nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * Take one element at a time from the array and see if the running sum is greater than the current number.
 *      If the running sum is greater than current number, then expand the current window since our new
 *      If the number is greater than the current window, then we can discard the current window and start a new window from current element.
 * For each element, check the current window's sum against the max and set the max.
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = 0;
        // current window's start
        int currStart = 0;

        // maximum subarray's start and end
        int start = 0;
        int end = 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currSum += nums[i];
            // if the current number is bigger than the current sum, then we are reseting the window to current number only
            if (currSum < nums[i]) {
                currSum = nums[i];
                currStart = i;
            }

            // if current window's sum is greater than previous max, then set the new max and set the start of max window to same as current window. End will be i since i is moving
            if (max < currSum) {
                max = currSum;
                start = currStart;
                end = i;
            }
        }

        // this is just for showing the window of the maximum subarray
        System.out.println(start);
        System.out.println(end);
        return max;
    }
}