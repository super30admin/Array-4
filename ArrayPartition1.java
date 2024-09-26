/*
 * #561. Array Partition I
 * 
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

Note:
1. n is a positive integer, which is in the range of [1, 10000].
2. All the integers in the array will be in the range of [-10000, 10000].

 */


/*
 * Time Complexity: O (N logN) -> Sorting the array
 * 
 * Space Complexity: O (1) -> No extra space used
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.array4;

import java.util.Arrays;

public class ArrayPartition1 {
	public int arrayPairSum(int[] nums) {
        
        // #1. Base condition
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        /*
        *   To get the largest sum, the minimums from each pair are in increasing order, so sort the array
        */
        // #2. Sort the array
        Arrays.sort(nums);   // N.logN
        
        int largestSum = 0;
        
        /*
        *   We do not need to keep track of each pair just the minimum from each pair.
        *   Because, the array is sorted, we know first element from each pair will be the minimum 
        */
        // #3. Traverse through the sorted array from 0th index to < nums.length - 1, and keep incrementing pointer by 2
        for(int i = 0; i < nums.length - 1; i += 2){
            
            // #4. Add the minimum from each pair to largest sum
            largestSum += nums[i];
            
        }
        
        // #5. Return the largest sum
        return largestSum;
        
    }

}
