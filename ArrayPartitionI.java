// Time Complexity : O(NlogN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class ArrayPartitionI {
    class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int output = 0;
            for(int i =0; i < nums.length - 1; i+=2) {
                output += Math.min(nums[i], nums[i+1]);
            }
            return output;
        }
    }
}
