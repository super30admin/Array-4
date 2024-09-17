package Array4;

import java.util.Arrays;

/*S30 FAANG Problem #122 {Medium } - https://www.youtube.com/watch?v=7SQIOmwZwDI
    Given an array of 2n integers, your task is to group these integers into n pairs of integer, say which makes sum of min(a, b) for all i from 1 to n as large as possible.

    Example 1:
    Input: [1,4,3,2]



    Output: 4

    Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

    Note:
    n is a positive integer, which is in the range of [1, 10000].
    All the integers in the array will be in the range of [-10000, 10000].
    Source Link: https://leetcode.com/problems/array-partition-i/
        -------------------------------------------------------------------------------------------------------
        Time complexity : O(NogN) 
        space complexity: O(1) 
        Approach:
        Did this code run successfully in leet code : yes
        problems faces : no*/

public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;
        
        Arrays.sort(nums);

        int maxSum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            maxSum = maxSum + nums[i];
        }

        return maxSum;
    }

}
