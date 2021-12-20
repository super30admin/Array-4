// Time Complexity : O(nlogn)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;

class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i += 2) {
            
            sum += nums[i];
            
        }
        
        return sum;
    }
}