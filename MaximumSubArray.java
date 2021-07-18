package Array4;

/*S30 FAANG Problem #123 {Medium} https://www.youtube.com/watch?v=7SQIOmwZwDI
    Given an integer array nums, find the contiguous subarray which has the largest sum 

    Example:
    Input: [-2,1,-3,4,-1,2,1,-5,4],
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.

    Source Link: https://leetcode.com/problems/maximum-subarray/
-------------------------------------------------------------------------------------------------------
Time complexity : O(N) 
space complexity: O(1) 
Approach:
Did this code run successfully in leet code : yes
problems faces : no*/

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int rSum = nums[0];
        int max = nums[0];

        int start = 0;
        int end = 0; //mainting pointers on max window
        int currStart = 0; //pointer for my current window

        for (int i = 1; i < nums.length; i++) {
            if (rSum + nums[i] < nums[i]) {
                rSum = nums[i];
                currStart = i;
            } else {
                rSum = rSum + nums[i];
            }
            if (rSum > max) {
                max = rSum;
                start = currStart;
                end = i;
            }
        }

        System.out.println("start index " + start);
        System.out.println("end index " + end);
        return max;
    }

}
