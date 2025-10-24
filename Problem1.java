// Time Complexity : O(n log n) where n is the number of items in nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * Since we have to minimize the gap between the pair to get the maximum sum, we will sort the array and take the smaller number from the pair.
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }

        return sum;
    }
}