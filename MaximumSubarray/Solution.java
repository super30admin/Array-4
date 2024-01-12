// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Max will store the overall maximum(result). curr will store max between the current number and sum of previous sum plus current number.
 * This will help us when range is in the middle of the array
 */
class Solution {
    public int maxSubArray(int[] nums) {

        int curr =nums[0];
        int max=nums[0];

        for(int i=1; i<nums.length; i++) {
            curr = Math.max(nums[i], curr+nums[i]);
            max = Math.max(max,curr);
        }

        return max;
    }
}

/**
 * Solution to find the actual subarray with maximum sum
 */
class Solution {
    public int maxSubArray(int[] nums) {

        int curr = nums[0];
        int max = nums[0];
        int s = 0, cs = 0, e = 0;

        for(int i=1; i<nums.length; i++) {

            if(nums[i] > curr+nums[i]) {
                cs = i;
                curr = nums[i];
            }
            else {
                curr += nums[i];
            }

            if(curr > max) {
                s = cs;
                e = i;
                max = curr;
            }
        }

        for(int i=s; i<=e; i++)
            System.out.print(nums[i] + " ");

        return max;
    }
}