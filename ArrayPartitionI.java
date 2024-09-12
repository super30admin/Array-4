import java.util.Arrays;

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

// Your code here along with comments explaining your approach
public class ArrayPartitionI {
    class Solution {
        //sort nums array and then iterate over array in steps of 2 and then add nums[i] to sums(nums[i] will be the min
        //value since array was sorted
        public int arrayPairSum(int[] nums) {
            int sum = 0;
            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i+=2) {
                sum += nums[i];
            }
            return sum;
        }
    }
}
