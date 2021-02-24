// Time Complexity : The time complexity is O(n) where n is the length of array
// Space Complexity : The space complexity if O(n) where n is the length of array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int sum = 0;

        // Pairs can be formed by every 2 consecutive numbers after sorting
        for(int i=0;i<nums.length;i+=2){

            sum += nums[i];

        }

        return sum;

    }
}