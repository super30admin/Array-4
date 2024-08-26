// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int rsum = nums[0];
        int max = nums[0];
        int start = 1;
        int end = 1;
        int currStart = 1;

        for (int i = 1; i < nums.length; i++) {
            rsum += nums[i];
            if (nums[i] > rsum) {
                rsum = nums[i];
                currStart = i;
            }

            if (rsum > max) {
                max = rsum;
                start = currStart;
                end = i;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return max;
    }
}