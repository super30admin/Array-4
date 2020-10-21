/*
 * #53. Maximum Subarray
 * 
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:

Input: nums = [1]
Output: 1

Example 3:

Input: nums = [0]
Output: 0

Example 4:

Input: nums = [-1]
Output: -1

Example 5:

Input: nums = [-2147483647]
Output: -2147483647
 

Constraints:

1. 1 <= nums.length <= 2 * 104
2. -231 <= nums[i] <= 231 - 1

 */


/*
 * Time Compelxity: O (N) -> To traverse through the input array
 * 
 * Space Complexity: O (1) -> No extra space used
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.array4;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
        
        // #1. Base condition
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        /*
        *   curr_sum -> is to decide whether to start a new subarray from current element or not
        *               Whenever we start a new subarray, max_sum also changes to indicate that we can get largest sum from current subarray in process
        *   max_sum -> to keep track of largest sum of a contiguous subarray
        */
        
        // #2. Initialize the curr_Sum and max_sum pointers
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        
        /*
        *   Kadanes's Algorithm
        */
        // #3. Traverse through the input array to find contiguous subarray with largest sum
        for(int num : nums){
            curr_sum = Math.max(curr_sum + num, num); // curr_sum + num -> If this is greater, then continue same contiguous subarray
                                                      // num -> If current element is greater, then start a new subarray, max_sum will change in this case
            max_sum = Math.max(curr_sum, max_sum);
        }
        
        // #4. Return the largest sum from contiguous subarray
        return max_sum;
        
    }

}
