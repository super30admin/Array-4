// Time Complexity : O(n log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        for (int i = 0; i < n; i = i + 2) {
            result += nums[i];
        }
        return result;
    }
}