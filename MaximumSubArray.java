// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Approach

// We solve this by taking rsum and max
// We iterate throught the array
// We take the rsum as max of rsum+nums[i], nums[i]
// max as max of max and rsum
// we return max as result

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int rsum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            rsum = Math.max(rsum + nums[i], nums[i]);
            max = Math.max(rsum, max);
        }
        return max;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Approach
// same approach as above but we also include start and end indexes

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int rsum = nums[0];
        int max = nums[0];
        int currStart = 0, start = 0, end = 0;

        for (int i = 1; i < nums.length; i++) {
            if (rsum + nums[i] > nums[i])
                rsum = rsum + nums[i];
            else {
                rsum = nums[i];
                currStart = i;
            }
            if (rsum > max) {
                max = rsum;
                start = currStart;
                end = i;
            }

        }
        return max;
    }
}