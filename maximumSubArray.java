// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
        int sumTillNow = 0;
        int maxSum = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            sumTillNow += nums[i];
            
            if (sumTillNow > maxSum) {
                maxSum = sumTillNow;
            }
            
            if (sumTillNow < 0) {
                sumTillNow = 0;
            }
        }
        
        return maxSum;
    }
}