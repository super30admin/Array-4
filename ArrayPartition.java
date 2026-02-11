// Time Complexity : O(n log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Sort the array and add the elements at even indices to the sum
// We try to minimize the difference between the pairs so we can maximize the sum of pairs
// The extra pair is made sure not to be wasted by another max pair

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = nums[0];
        for (int i = 2; i < nums.length; i += 2)
            sum += nums[i];
        return sum;
    }
}