// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
/*
 * Approach 1
 * 1 - The idea is to use the concept of running sum.
 * 2- We will traverse the array and calculate the sum at every index. If the calculated sum is greater than
 * the previous sum, we update the maximum
 */

public class MaxSumSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currSum = nums[0];
        
        for(int i = 1; i < nums.length;i++)
        {
            currSum = Math.max(nums[i],currSum+nums[i]);
            max = Math.max(max,currSum);
        }
        return max;
    }
}



/*
 * Approach 2 - Give the indices of the subarray as well
 */
public int maxSubArray(int[] nums) {
    if(nums.length == 0 || nums == null)
        return 0;
    
    int max = nums[0];
    int currSum = nums[0];
    int currStart = 0;
    int start = 0;
    int end = 0;
    
    for(int i = 1; i < nums.length;i++)
    {
        if(nums[i] > currSum + nums[i])
        {
            currSum = nums[i];
            currStart = i;
        }
        else
        {
            currSum = nums[i] + currSum;
        }
        if(currSum > max)
        {
            max = currSum;
            start = currStart;
            end = i;
        }
    }
    System.out.println(start);
    System.out.println(end);
    return max;
}