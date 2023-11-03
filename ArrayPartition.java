// # Time Complexity:  O(nlogn) where n is the length of nums
// #  Space Complexity:  O(1) 
// #  Did this code successfully run on Leetcode : Yes
// #  Any problem you faced while coding this : No
import java.util.*;
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < n; i = i+2) {
            sum = sum + nums[i];
        }
        return sum; 
    }
}
