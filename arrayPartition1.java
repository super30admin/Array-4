// Time Complexity = O(nlogn)
// Time Complexity = O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// In order to optimize the result we sort the array and make pairs with the adjacent elements
class Solution {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int n=nums.length, sum=0;

        for (int i=0; i<n-1; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}