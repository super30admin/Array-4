// Time Complexity : The time complexity is O(n) where n is the length of array
// Space Complexity : The space complexity if O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            // to maximize the sum, the current sum should be positive
            if(sum > 0){
                sum += nums[i];
            }
            // reset the sum
            else{
                sum = nums[i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}