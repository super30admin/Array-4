//https://leetcode.com/problems/maximum-subarray/
/*
Time: O(n) where n = nums.length
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int maxsofar = nums[0];
        int currmax = nums[0];
        int start = 0, end = 0;
        int finalStart = 0, finalEnd = 0;

        for (int i = 1; i < nums.length; i++) {
            currmax = Math.max(nums[i], currmax + nums[i]); // thatNumber or (currMax + thatNumber)

            /* Block to Print the numbers -- Start Here */
            if (nums[i] > currmax + nums[i]) {
                start = i;
                end = i;
            } else // could be a potential end
                end = i;

            if (maxsofar < currmax) {
                finalStart = start;
                finalEnd = end;
            }
            /* Block to Print the numbers -- End Here */

            maxsofar = Math.max(currmax, maxsofar);

        }
        // Print
        for (int index = finalStart; index <= finalEnd; index++)
            System.out.print(nums[index] + " ");

        return maxsofar;

    }

}
