// Time Complexity : O(n log(n)) --> where n is the length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (561): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i=i+2) sum += nums[i];
        return sum;
    }
}