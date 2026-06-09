// Time Complexity : O(n log n) due to sorting
// Space Complexity : O(1) as we are sorting in place
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We sort the array and then sum up the elements at even indices to get the maximum sum of pairs.  
// This works because after sorting, the smallest element in each pair will be at the even index, and we want to maximize the sum of these minimums.    
// Count sort can also be used to achieve O(n) time complexity if the range of numbers is known and not too large. But space is O(k) where k is the range of numbers.

import java.util.*;

class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}