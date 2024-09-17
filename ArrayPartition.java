import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(nlogn) where n = length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//561. Array Partition (Easy) - https://leetcode.com/problems/array-partition/
class Solution {
    public int arrayPairSum(int[] nums) {
        // Sort the array and make adjacent numbers as pairs so as to reduce the difference between them.
        // In this way, we are able to discard only the next largest element to the current smaller number in pair
        Arrays.sort(nums); // O(nlogn) where n = number of elements
        
        int result = 0;
        
        for (int i = 0; i < nums.length; i+=2) {
            result += nums[i];
        }
        
        return result;
    }
}