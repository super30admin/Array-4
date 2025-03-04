// In this problem, keeping two variables, rSum and max. For each element, we have two options, one is calculating the rSum by 
// adding the current element to previous rSum, second taking the current element as standalone, comparing both and whatever is 
// max, updating rSum with that. Then comparing it with current max and updating if required.

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public int maxSubArray(int[] nums) {
        // Base case
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // Declare variables and assign nums[0] to both
        int rSum = nums[0];
        int max = nums[0];
        // Loop from index 1
        for (int i = 1; i < nums.length; i++) {
            // Update the rSum based on max between (oldrSum + currentElement,
            // currentElement standalone)
            rSum = Math.max(rSum + nums[i], nums[i]);
            // Update max by comparing old max and the rSum
            max = Math.max(max, rSum);
        }
        // Return max
        return max;
    }
}

// Below is the solution when problem setter ask to return the subarray which
// gave maximum sum:
// In above approach, adding two more variables start and end and assigning
// value 0 index. Then as we update the rSum, if the max rSum came from
// standalone value, updating both start and end to i, else only updating end to
// i. Whenever max changes we change start and end depending on where the max
// rSum came from.

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int rSum = nums[0];
        int max = nums[0];
        int start = 0;
        int end = 0;
        for (int i = 1; i < nums.length; i++) {
            // Check if rSum is coming from combination that adding the element to previous
            // rSum, then no need to update start
            if (rSum + nums[i] > nums[i]) {
                rSum = rSum + nums[i];
            } else {
                // If coming from standalone, only then update start
                rSum = nums[i];
                start = i;
            }
            if (rSum > max) {
                // If the max changes, end always changes
                end = i;
                max = rSum;
            }
        }
        System.out.println("start: " + start + " end: " + end);
        return max;
    }
}